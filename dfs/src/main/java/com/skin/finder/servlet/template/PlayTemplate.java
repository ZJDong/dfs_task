/*
 * $RCSfile: PlayTemplate.java,v $
 * $Revision: 1.1 $
 *
 * JSP generated by JspCompiler-1.0.0
 */
package com.skin.finder.servlet.template;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * <p>Title: PlayTemplate</p>
 * <p>Description: </p>
 * @author JspKit
 * @version 1.0
 */
public class PlayTemplate extends com.skin.finder.web.servlet.JspServlet {
    private static final long serialVersionUID = 1L;
    private static final PlayTemplate instance = new PlayTemplate();


    /**
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    public static void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        instance.service(request, response);
    }

    /**
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html; charset=utf-8");
        OutputStream out = response.getOutputStream();

        out.write(_jsp_string_1, 0, _jsp_string_1.length);
        out.write(_jsp_string_2, 0, _jsp_string_2.length);
        out.write(_jsp_string_3, 0, _jsp_string_3.length);
        this.write(out, request.getAttribute("path"));
        out.write(_jsp_string_5, 0, _jsp_string_5.length);
        out.write(_jsp_string_6, 0, _jsp_string_6.length);
        out.write(_jsp_string_7, 0, _jsp_string_7.length);
        out.write(_jsp_string_8, 0, _jsp_string_8.length);
        out.write(_jsp_string_9, 0, _jsp_string_9.length);
        out.write(_jsp_string_10, 0, _jsp_string_10.length);
        out.write(_jsp_string_11, 0, _jsp_string_11.length);
        out.write(_jsp_string_12, 0, _jsp_string_12.length);
        out.write(_jsp_string_13, 0, _jsp_string_13.length);
        out.write(_jsp_string_14, 0, _jsp_string_14.length);
        out.write(_jsp_string_15, 0, _jsp_string_15.length);
        out.write(_jsp_string_16, 0, _jsp_string_16.length);
        out.write(_jsp_string_17, 0, _jsp_string_17.length);
        out.write(_jsp_string_18, 0, _jsp_string_18.length);
        out.write(_jsp_string_19, 0, _jsp_string_19.length);
        out.write(_jsp_string_20, 0, _jsp_string_20.length);
        out.write(_jsp_string_21, 0, _jsp_string_21.length);
        out.write(_jsp_string_22, 0, _jsp_string_22.length);
        out.write(_jsp_string_23, 0, _jsp_string_23.length);
        out.write(_jsp_string_24, 0, _jsp_string_24.length);
        out.write(_jsp_string_25, 0, _jsp_string_25.length);
        out.write(_jsp_string_26, 0, _jsp_string_26.length);
        out.write(_jsp_string_27, 0, _jsp_string_27.length);
        out.write(_jsp_string_28, 0, _jsp_string_28.length);
        out.write(_jsp_string_29, 0, _jsp_string_29.length);
        out.write(_jsp_string_30, 0, _jsp_string_30.length);
        out.write(_jsp_string_31, 0, _jsp_string_31.length);
        out.write(_jsp_string_32, 0, _jsp_string_32.length);
        out.write(_jsp_string_33, 0, _jsp_string_33.length);
        out.write(_jsp_string_34, 0, _jsp_string_34.length);
        out.write(_jsp_string_35, 0, _jsp_string_35.length);
        out.write(_jsp_string_36, 0, _jsp_string_36.length);
        this.write(out, request.getAttribute("loacalIp"));
        out.write(_jsp_string_38, 0, _jsp_string_38.length);
        this.write(out, request.getAttribute("contextPath"));
        out.write(_jsp_string_40, 0, _jsp_string_40.length);
        this.write(out, request.getAttribute("host"));
        out.write(_jsp_string_42, 0, _jsp_string_42.length);
        this.write(out, request.getAttribute("workspace"));
        out.write(_jsp_string_44, 0, _jsp_string_44.length);
        this.write(out, request.getAttribute("work"));
        out.write(_jsp_string_46, 0, _jsp_string_46.length);
        this.write(out, request.getAttribute("path"));
        out.write(_jsp_string_48, 0, _jsp_string_48.length);
        out.write(_jsp_string_49, 0, _jsp_string_49.length);

        out.flush();
    }

    protected static final byte[] _jsp_string_1 = b("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
    protected static final byte[] _jsp_string_2 = b("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n<meta http-equiv=\"Cache-Control\" content=\"no-cache\"/>\r\n");
    protected static final byte[] _jsp_string_3 = b("<meta http-equiv=\"Expires\" content=\"0\"/>\r\n<title>");
    protected static final byte[] _jsp_string_5 = b(" - Powered by Finder</title>\r\n<link rel=\"shortcut icon\" href=\"?action=res&path=/finder/images/favicon.png\"/>\r\n");
    protected static final byte[] _jsp_string_6 = b("<link rel=\"stylesheet\" type=\"text/css\" href=\"?action=res&path=/finder/media/css/media.css\"/>\r\n");
    protected static final byte[] _jsp_string_7 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/jquery-1.7.2.min.js\"></script>\r\n");
    protected static final byte[] _jsp_string_8 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/widget.js\"></script>\r\n");
    protected static final byte[] _jsp_string_9 = b("<script type=\"text/javascript\" src=\"?action=res&path=/finder/media/index.js\"></script>\r\n");
    protected static final byte[] _jsp_string_10 = b("<script type=\"text/javascript\">\r\n<!--\r\njQuery(function() {\r\n    jQuery(document.body).css(\"margin\", \"0px\");\r\n");
    protected static final byte[] _jsp_string_11 = b("    jQuery(document.body).css(\"padding\", \"0px\");\r\n    jQuery(document.body).css(\"backgroundColor\", \"#333333\");\r\n");
    protected static final byte[] _jsp_string_12 = b("    jQuery(document.body).css(\"overflow\", \"hidden\");\r\n});\r\n\r\njQuery(function() {\r\n");
    protected static final byte[] _jsp_string_13 = b("    var playList = new PlayList();\r\n    var host = document.body.getAttribute(\"host\");\r\n");
    protected static final byte[] _jsp_string_14 = b("    var workspace = document.body.getAttribute(\"workspace\");\r\n    var path = document.body.getAttribute(\"path\");\r\n");
    protected static final byte[] _jsp_string_15 = b("    var requestURI = window.location.pathname;\r\n\r\n    var prefix = requestURI + \"?action=finder.download&host=\" + encodeURIComponent(host) + \"&workspace=\" + encodeURIComponent(workspace);\r\n");
    protected static final byte[] _jsp_string_16 = b("    playList.add({\"title\": \"test\", \"url\": prefix + \"&path=\" + encodeURIComponent(path)});\r\n");
    protected static final byte[] _jsp_string_17 = b("\r\n    var videoPlayer = new VideoPlayer({\"container\": \"finder-videodialog\"});\r\n    var container = videoPlayer.getContainer();\r\n");
    protected static final byte[] _jsp_string_18 = b("    var parent = jQuery(container);\r\n    parent.css(\"top\", \"0px\");\r\n    parent.css(\"left\", \"0px\");\r\n");
    protected static final byte[] _jsp_string_19 = b("    parent.css(\"width\", \"100%\");\r\n    parent.css(\"height\", \"auto\");\r\n    parent.css(\"position\", \"static\");\r\n");
    protected static final byte[] _jsp_string_20 = b("    parent.css(\"border\", \"none\");\r\n    parent.find(\"div.title\").remove();\r\n\r\n    jQuery(window).resize(function() {\r\n");
    protected static final byte[] _jsp_string_21 = b("        var height = (document.documentElement.clientHeight - 100);\r\n        parent.find(\"video\").attr(\"width\", \"100%\");\r\n");
    protected static final byte[] _jsp_string_22 = b("        parent.find(\"video\").attr(\"height\", height + \"px;\");\r\n    });\r\n    jQuery(window).resize();\r\n");
    protected static final byte[] _jsp_string_23 = b("\r\n    videoPlayer.setPlayList(playList);\r\n    videoPlayer.play(0);\r\n    parent.show();\r\n");
    protected static final byte[] _jsp_string_24 = b("});\r\n\r\njQuery(function() {\r\n    /**\r\n     * jQuery-1.7.2版本的paste事件获取不到clipboardData\r\n");
    protected static final byte[] _jsp_string_25 = b("     * 该事件尽可能放到jQuery事件之前\r\n     * bug: IE11不触发paste事件\r\n     */\r\n    EventUtil.addEventListener(document, \"paste\", function(event) {\r\n");
    protected static final byte[] _jsp_string_26 = b("        return DialogManager.dispatch(\"paste\", event);\r\n    });\r\n\r\n    jQuery(document).click(function(event) {\r\n");
    protected static final byte[] _jsp_string_27 = b("        return DialogManager.dispatch(\"click\", event);\r\n    });\r\n\r\n    jQuery(document).dblclick(function(event) {\r\n");
    protected static final byte[] _jsp_string_28 = b("        return DialogManager.dispatch(\"dblclick\", event);\r\n    });\r\n\r\n    /**\r\n     * keydown事件先于paste触发\r\n");
    protected static final byte[] _jsp_string_29 = b("     * 因此要保证paste被触发必须使Ctrl + V操作返回true\r\n     * 如果Ctrl + V事件存在弹框, 那么root将无法捕获到paste事件\r\n");
    protected static final byte[] _jsp_string_30 = b("     * 因为当弹框出现的时候, 弹框是活动窗口, 因此paste事件不会被传递到root\r\n     */\r\n    jQuery(document).keydown(function(event) {\r\n");
    protected static final byte[] _jsp_string_31 = b("        var flag = DialogManager.dispatch(\"keydown\", event);\r\n        return flag;\r\n");
    protected static final byte[] _jsp_string_32 = b("    });\r\n\r\n    jQuery(document).bind(\"contextmenu\", function(event) {\r\n        var e = (event || window.event);\r\n");
    protected static final byte[] _jsp_string_33 = b("        var src = (e.srcElement || e.target);\r\n        var nodeName = src.nodeName.toLowerCase();\r\n");
    protected static final byte[] _jsp_string_34 = b("\r\n        if(nodeName == \"input\" || nodeName == \"textarea\") {\r\n            return true;\r\n");
    protected static final byte[] _jsp_string_35 = b("        }\r\n        else {\r\n            return DialogManager.dispatch(\"contextmenu\", e);\r\n");
    protected static final byte[] _jsp_string_36 = b("        }\r\n    });\r\n});\r\n//-->\r\n</script>\r\n</head>\r\n<body loacalIp=\"");
    protected static final byte[] _jsp_string_38 = b("\" contextPath=\"");
    protected static final byte[] _jsp_string_40 = b("\" host=\"");
    protected static final byte[] _jsp_string_42 = b("\" workspace=\"");
    protected static final byte[] _jsp_string_44 = b("\" work=\"");
    protected static final byte[] _jsp_string_46 = b("\" path=\"");
    protected static final byte[] _jsp_string_48 = b("\">\r\n<div id=\"finder-videodialog\" class=\"media-dialog\" contextmenu=\"false\" style=\"z-index: 1010; margin-top: 0px; margin-left: 0px; display: block;\"></div>\r\n");
    protected static final byte[] _jsp_string_49 = b("</body>\r\n</html>\r\n");

}
