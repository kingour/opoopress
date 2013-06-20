/*
 * Copyright 2013 Alex Lin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opoo.press;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.opoo.press.source.Source;

/**
 * 判断是否非静态文件
 * 
 * 需要过滤源文件
 * 
 * @author Alex Lin
 *
 */
public interface Site extends SiteBuilder{
	File getSource();
	
	File getTemplates();
	
	File getAssets();
	
	File getDestination();
	
	File getWorking();
	
	String getRoot();
	
	Map<String,Object> getConfig();
	
	List<Post> getPosts();
	
	List<Page> getPages();

	List<StaticFile> getStaticFiles();
	
	Date getTime();
	
	Map<String, List<Post>> getCategories();
	Map<String, List<Post>> getTags();
	Map<String, String> getCategoryNames();
	Map<String, String> getTagNames();
	
	//void build();
	
	Renderer getRenderer();
	Converter getConverter(Source source);
	
	Locale getLocale();
}
