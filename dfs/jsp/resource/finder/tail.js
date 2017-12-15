// (c)2013 www.finderweb.net

if(typeof(window.localStorage)=="undefined"){window.localStorage={};}
var Tail={};Tail.rows=0;Tail.length=0;Tail.maxRows=1000;Tail.position=-1;Tail.running=false;Tail.scroll=true;Tail.timeout=1000;Tail.editorId="tail-editor";Tail.containerId="tail-container";Tail.tailURL=window.location.pathname+"?action=less.getTail&";Tail.getContextPath=function(){if(this.contextPath==null||this.contextPath==undefined){var contextPath=document.body.getAttribute("contextPath");if(contextPath==null||contextPath=="/"){contextPath="";}
this.contextPath=contextPath;}
return this.contextPath;};Tail.getTailURL=function(position,rows){var params=[];params[params.length]="host="+encodeURIComponent(this.host);params[params.length]="workspace="+encodeURIComponent(this.workspace);params[params.length]="path="+encodeURIComponent(this.path);params[params.length]="position="+position;params[params.length]="rows="+rows;params[params.length]="charset="+this.charset;return this.tailURL+params.join("&");};Tail.parse=function(text){if(text==null){return{"status":999,"message":"empty response."};}
try{var k=text.indexOf("\n");if(k>-1){var json=text.substring(0,k);var content=text.substring(k+1);var range=window.eval("("+json+")");if(range!=null&&range.value!=null){range.value.content=content;}
return range;}
else{return window.eval("("+text+")");}}
catch(e){return{"status":999,"message":e.name+": "+e.message};}};Tail.setScroll=function(b){this.scroll=b;};Tail.getTimeout=function(){var e=document.getElementById("tail-reload-interval");if(e!=null){var timeout=parseInt(e.value);if(isNaN(timeout)==false&&timeout>=1){return timeout*1000;}}
return 2000;};Tail.start=function(){this.stop();this.running=true;this.poll();};Tail.stop=function(){this.running=false;if(this.timer!=null){clearTimeout(this.timer);}};Tail.poll=function(){if(this.running!=true){return;}
var position=this.getEnd();var rows=this.getRows();var length=this.length;var url=this.getTailURL(position,rows);var keyword=this.getKeyword();var regexp=this.getRegexp(keyword);jQuery.ajax({type:"get",url:url,dataType:"text",error:function(req,status,error){var message="\r\n## ** ERROR: ** ##\r\n"+status+": "+error+"\r\n\r\n";Tail.append({"start":position,"end":position,"rows":1,"length":length,"content":message});},success:function(text){var result=Tail.parse(text);var range=result.value;if(range==null){var message="\r\n## ** ERROR: ** ##\r\n500: no data\r\n\r\n";Tail.append({"start":position,"end":position,"rows":1,"length":length,"content":message});return;}
if(range.length<Tail.length){window.location.reload();return;}
if(result.status==200){Tail.append(Tail.filter(range,keyword,regexp),keyword,regexp);}
else{var message="\r\n## ** ERROR: ** ##\r\n500: "+result.message+"\r\n\r\n";Tail.append({"start":position,"end":position,"rows":1,"length":length,"content":message});return;}}});};Tail.filter=function(range,keyword,regexp){if(keyword!=null&&keyword.length>0&&range.rows>0){var buffer=[];var content=range.content;var array=content.split("\n");var reg=new RegExp(keyword);reg.compile(keyword);for(var i=0;i<array.length;i++){if(regexp==true&&reg.test(array[i])){buffer[buffer.length]=array[i];}
else if(array[i].indexOf(keyword)>-1){buffer[buffer.length]=array[i];}}
range.rows=buffer.length;buffer[buffer.length]="";range.content=buffer.join("\r\n");}
return range;};Tail.append=function(range,keyword,regexp){var modified=this.modified(range);if(range!=null){this.length=range.length;this.rows=this.rows+range.rows;this.lastModified=range.lastModified;if(range.rows>0){var e=this.getEditor();var p=this.create(range,keyword,regexp);while(e.childNodes.length>100){var node=e.childNodes[0];var count=parseInt(node.getAttribute("rows"));e.removeChild(node);this.rows-=count;}
while(this.rows>this.maxRows){if(e.childNodes.length>1){var node=e.childNodes[0];var count=parseInt(node.getAttribute("rows"));e.removeChild(node);this.rows-=count;}
else{break;}}
e.appendChild(p);if(this.scroll==true){var scrollHeight=e.scrollHeight;if(range.rows<=5){e.scrollTop=scrollHeight;}
else{jQuery(e).stop();jQuery(e).animate({"scrollTop":scrollHeight},range.rows*5);}}}
else{Tail.setEnd(range.end);}
if(range.length-1>range.end){Tail.poll();return;}
else{}}
if(this.timer!=null){clearTimeout(this.timer);this.timer=null;}
if(modified){this.timeout=1000;}
else{this.timeout=this.timeout+1000;}
if(this.timeout>10000){this.timeout=10000;}
this.timer=setTimeout(function(){Tail.poll();},this.timeout);};Tail.modified=function(range){if(range==null){return true;}
return(this.length!=range.length||this.lastModified!=range.lastModified);};Tail.select=function(){var e=this.getEditor();if(document.all){var range=document.body.createTextRange();range.moveToElementText(e);range.select();}
else{var selection=window.getSelection();if(selection.setBaseAndExtent){selection.setBaseAndExtent(e,0,e,1);}
else{var range=document.createRange();range.selectNodeContents(e);selection.removeAllRanges();selection.addRange(range);window.focus();}}};Tail.clear=function(){this.rows=0;this.getEditor().innerHTML="";};Tail.getKeyword=function(){return this.keyword;};Tail.getRegexp=function(){if(this.keyword!=null){var regExp=new RegExp("^[0-9a-zA-Z]+$");if(regExp.test(this.keyword)){return false;}}
return(this.regexp==true);};Tail.getStart=function(){var e=this.getEditor();var list=e.childNodes;if(list.length>0){var node=list[0];return parseInt(node.getAttribute("start"));}
else{return 0;}};Tail.setEnd=function(end){var e=this.getEditor();var list=e.childNodes;if(list.length>0){var node=list[list.length-1];node.setAttribute("end",end);}};Tail.getEnd=function(){var e=this.getEditor();var list=e.childNodes;if(list.length>0){var node=list[list.length-1];return parseInt(node.getAttribute("end"));}
else{return this.length-1;}};Tail.getRows=function(){var c=this.getContainer();return Math.max(3*Math.floor(jQuery(c).height()/16),300);};Tail.getContainer=function(){if(this.container==null){this.container=document.getElementById(this.containerId);}
return this.container;};Tail.getEditor=function(){if(this.container==null){this.container=document.getElementById(this.containerId);}
return this.container;};Tail.highlight1=function(element,content,keyword){if(content==null){return;}
if(keyword==null||keyword.length<1){element.appendChild(document.createTextNode(content));return;}
var s=0;var e=0;var d=keyword.length;while(true){e=content.indexOf(keyword,s);if(e<0){element.appendChild(document.createTextNode(content.substring(s)));break;}
var span=document.createElement("span");span.className="keyword";span.appendChild(document.createTextNode(keyword));element.appendChild(document.createTextNode(content.substring(s,e)));element.appendChild(span);s=e+d;}};Tail.highlight2=function(element,content,keyword){if(content==null){return;}
if(keyword==null||keyword.length<1){element.appendChild(document.createTextNode(content));return;}
var start=0;var end=0;var regexp=new RegExp().compile(keyword,"g");var array=content.match(regexp);if(array==null){return;}
for(var i=0;i<array.length;i++){var item=array[i];end=content.indexOf(item,start);if(start>-1){var span=document.createElement("span");span.className="keyword";span.appendChild(document.createTextNode(item));element.appendChild(document.createTextNode(content.substring(start,end)));element.appendChild(span);start=end+item.length;}
else{break;}}
if((start+1)<content.length){element.appendChild(document.createTextNode(content.substring(start)));}};Tail.create=function(range,keyword,regexp){var p=document.createElement("pre");p.setAttribute("start",range.start);p.setAttribute("end",range.end);p.setAttribute("rows",range.rows);p.setAttribute("length",range.length);if(keyword==null||keyword.length<1){p.appendChild(document.createTextNode(range.content));}
else{if(regexp!=true){Tail.highlight1(p,range.content,keyword);}
else{Tail.highlight2(p,range.content,keyword);}}
return p;};Tail.init=function(){this.host=document.body.getAttribute("host");this.workspace=document.body.getAttribute("workspace");this.path=document.body.getAttribute("path");this.charset=document.body.getAttribute("charset");this.fontFamily=Finder.getConfig("less.fontFamily","Lucida Console");this.fontColor=Finder.getConfig("less.fontColor","#999999");this.backgroundColor=Finder.getConfig("less.backgroundColor","#000000");if(this.charset==null||this.charset.length<1){this.charset=Finder.getConfig("global.charset","utf-8");}
var container=this.getContainer();container.style.color=this.fontColor;container.style.fontFamily=this.fontFamily;container.style.backgroundColor=this.backgroundColor;Charset.setup(jQuery("select[name=charset]").get(0),this.charset);jQuery("select[name=charset]").change(function(){Tail.charset=this.value;});jQuery("#tail-clear-btn").click(function(){Tail.clear();});jQuery("#tail-stop-btn").toggle(function(){this.value="开 始";Tail.stop();},function(){this.value="停 止";Tail.start();});jQuery("#tail-select-btn").click(function(){Tail.select();});jQuery("#tail-reload-btn").click(function(){window.location.reload();});jQuery("#tail-find-btn").click(function(){jQuery("#find-panel").show();});jQuery("#tail-auto-scroll").click(function(){Tail.setScroll(this.checked);});jQuery("#grep-ensure").click(function(){jQuery("#find-panel").hide();Tail.keyword=jQuery("#grep-keyword").val();Tail.regexp=jQuery("#grep-regexp").prop("checked");Tail.stop();Tail.clear();Tail.start();});jQuery("#grep-close").click(function(){jQuery("#find-panel").hide();});jQuery(container).keydown(function(event){var keyCode=event.keyCode;if(keyCode==13){document.execCommand("InsertHtml",false,"\r\n");return false;}
return true;});jQuery(document.body).keydown(function(event){var keyCode=event.keyCode;if(event.ctrlKey==true&&keyCode==66){if(jQuery("#find-panel").is(":hidden")){jQuery("#find-panel").show();try{document.getElementById("grep-keyword").select();}
catch(e){}}
else{jQuery("#find-panel").hide();}
return false;}});Tail.start();};jQuery(function(){var container=Tail.getContainer();jQuery(window).bind("resize",function(){jQuery(container).height(jQuery(window).height()-48);});jQuery(window).trigger("resize");});jQuery(function(){Tail.init();var b=["Welcome to finder. http://www.finderweb.net","Copyright (C) 2008 Skin, Inc. All rights reserved.","This software is the proprietary information of Skin, Inc.","Use is subject to license terms.","================================================================================"];console.clear();console.log(b.join("\r\n"));});