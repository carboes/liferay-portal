/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.model.impl;

import com.liferay.portal.NoSuchLayoutException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.LayoutLocalServiceUtil;

import java.util.List;

/**
 * @author Jorge Ferrer
 */
public class LayoutPrototypeImpl extends LayoutPrototypeBaseImpl {

	public LayoutPrototypeImpl() {
	}

	public Group getGroup() throws PortalException, SystemException {
		return GroupLocalServiceUtil.getLayoutPrototypeGroup(
			getCompanyId(), getLayoutPrototypeId());
	}

	public long getGroupId() throws PortalException, SystemException {
		Group group = getGroup();

		return group.getGroupId();
	}

	public Layout getLayout() throws PortalException, SystemException {
		Group group = getGroup();

		if (group.getPrivateLayoutsPageCount() > 0) {
			List<Layout> layouts = LayoutLocalServiceUtil.getLayouts(
				group.getGroupId(), true);

			return layouts.get(0);
		}

		throw new NoSuchLayoutException();
	}

}