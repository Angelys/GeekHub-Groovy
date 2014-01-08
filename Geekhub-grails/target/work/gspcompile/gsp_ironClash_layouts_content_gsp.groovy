import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ironClash_layouts_content_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/_content.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (!layout_nomainmenu)) {
printHtmlPart(1)
if(true && (pageProperty(name: 'page.menubar'))) {
printHtmlPart(2)
invokeTag('pageProperty','g',6,['name':("page.menubar")],-1)
printHtmlPart(3)
}
else {
printHtmlPart(2)
invokeTag('render','g',9,['template':("/_menu/menubar")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (!layout_nosecondarymenu)) {
printHtmlPart(3)
if(true && (pageProperty(name: 'page.submenubar'))) {
printHtmlPart(2)
invokeTag('pageProperty','g',17,['name':("page.submenubar")],-1)
printHtmlPart(3)
}
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (flash.message && !layout_noflashmessage)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('layoutBody','g',27,[:],-1)
printHtmlPart(6)
invokeTag('pageProperty','g',28,['name':("page.body")],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389000022000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
