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

package com.liferay.portalweb.asset.messageboards.mbthread.viewportletmaximumitems5mbcategorymessage6ap;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class ViewMBCategoryThreadMessage6APTest extends BaseTestCase {
	public void testViewMBCategoryThreadMessage6AP() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.clickAt("link=Asset Publisher Test Page",
			RuntimeVariables.replace("Asset Publisher Test Page"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Add New"),
			selenium.getText("//span[@title='Add New']/ul/li/strong/a/span"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread6 Message Subject"),
			selenium.getText("xPath=(//h3[@class='asset-title'])[1]/a"));
		assertTrue(selenium.isPartialText(
				"xPath=(//div[@class='lfr-meta-actions asset-actions']/span/a[contains(.,Edit)]/span)[1]",
				"Edit"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread6 Message Body"),
			selenium.getText("xPath=(//div[@class='asset-summary'])[1]"));
		assertEquals(RuntimeVariables.replace(
				"Read More About MB Category Thread6 Message Subject \u00bb"),
			selenium.getText("xPath=(//div[@class='asset-more']/a)[1]"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread5 Message Subject"),
			selenium.getText("xPath=(//h3[@class='asset-title'])[2]/a"));
		assertTrue(selenium.isPartialText(
				"xPath=(//div[@class='lfr-meta-actions asset-actions']/span/a[contains(.,Edit)]/span)[2]",
				"Edit"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread5 Message Body"),
			selenium.getText("xPath=(//div[@class='asset-summary'])[2]"));
		assertEquals(RuntimeVariables.replace(
				"Read More About MB Category Thread5 Message Subject \u00bb"),
			selenium.getText("xPath=(//div[@class='asset-more']/a)[2]"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread4 Message Subject"),
			selenium.getText("xPath=(//h3[@class='asset-title'])[3]/a"));
		assertTrue(selenium.isPartialText(
				"xPath=(//div[@class='lfr-meta-actions asset-actions']/span/a[contains(.,Edit)]/span)[3]",
				"Edit"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread4 Message Body"),
			selenium.getText("xPath=(//div[@class='asset-summary'])[3]"));
		assertEquals(RuntimeVariables.replace(
				"Read More About MB Category Thread4 Message Subject \u00bb"),
			selenium.getText("xPath=(//div[@class='asset-more']/a)[3]"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread3 Message Subject"),
			selenium.getText("xPath=(//h3[@class='asset-title'])[4]/a"));
		assertTrue(selenium.isPartialText(
				"xPath=(//div[@class='lfr-meta-actions asset-actions']/span/a[contains(.,Edit)]/span)[4]",
				"Edit"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread3 Message Body"),
			selenium.getText("xPath=(//div[@class='asset-summary'])[4]"));
		assertEquals(RuntimeVariables.replace(
				"Read More About MB Category Thread3 Message Subject \u00bb"),
			selenium.getText("xPath=(//div[@class='asset-more']/a)[4]"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread2 Message Subject"),
			selenium.getText("xPath=(//h3[@class='asset-title'])[5]/a"));
		assertTrue(selenium.isPartialText(
				"xPath=(//div[@class='lfr-meta-actions asset-actions']/span/a[contains(.,Edit)]/span)[5]",
				"Edit"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread2 Message Body"),
			selenium.getText("xPath=(//div[@class='asset-summary'])[5]"));
		assertEquals(RuntimeVariables.replace(
				"Read More About MB Category Thread2 Message Subject \u00bb"),
			selenium.getText("xPath=(//div[@class='asset-more']/a)[5]"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread1 Message Subject"),
			selenium.getText("xPath=(//h3[@class='asset-title'])[6]/a"));
		assertTrue(selenium.isPartialText(
				"xPath=(//div[@class='lfr-meta-actions asset-actions']/span/a[contains(.,Edit)]/span)[6]",
				"Edit"));
		assertEquals(RuntimeVariables.replace(
				"MB Category Thread1 Message Body"),
			selenium.getText("xPath=(//div[@class='asset-summary'])[6]"));
		assertEquals(RuntimeVariables.replace(
				"Read More About MB Category Thread1 Message Subject \u00bb"),
			selenium.getText("xPath=(//div[@class='asset-more']/a)[6]"));
	}
}