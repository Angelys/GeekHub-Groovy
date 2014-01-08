import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ironClash_layoutskickstart_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/kickstart.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(session.'org.springframework.web.servlet.i18n.SessionLocaleResolver.LOCALE')
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',3,['default':(meta(name: 'app.name'))],-1)
})
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(4)
expressionOut.print(resource(plugin: 'kickstart-with-bootstrap', dir: 'images', file: 'favicon.ico'))
printHtmlPart(5)
invokeTag('require','r',18,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('require','r',18,['modules':("bootstrap_utils")],-1)
printHtmlPart(3)
invokeTag('layoutResources','r',18,[:],-1)
printHtmlPart(2)
invokeTag('layoutHead','g',20,[:],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',25,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('render','g',28,['template':("/_menu/navbar")],-1)
printHtmlPart(9)
if(true && (pageProperty(name: 'page.header'))) {
printHtmlPart(2)
invokeTag('pageProperty','g',31,['name':("page.header")],-1)
printHtmlPart(8)
}
else {
printHtmlPart(2)
invokeTag('render','g',34,['template':("/layouts/header")],-1)
printHtmlPart(8)
}
printHtmlPart(7)
invokeTag('render','g',37,['template':("/layouts/content")],-1)
printHtmlPart(10)
if(true && (pageProperty(name: 'page.footer'))) {
printHtmlPart(2)
invokeTag('pageProperty','g',41,['name':("page.footer")],-1)
printHtmlPart(8)
}
else {
printHtmlPart(2)
invokeTag('render','g',44,['template':("/layouts/footer")],-1)
printHtmlPart(8)
}
printHtmlPart(11)
if(true && (pageProperty(name: 'page.include.bottom'))) {
printHtmlPart(12)
invokeTag('pageProperty','g',52,['name':("page.include.bottom")],-1)
printHtmlPart(2)
}
else {
printHtmlPart(13)
invokeTag('render','g',58,['template':("/_common/modals/registerDialog"),'model':([item: item])],-1)
printHtmlPart(8)
}
printHtmlPart(14)
invokeTag('layoutResources','r',61,[:],-1)
printHtmlPart(8)
})
invokeTag('captureBody','sitemesh',62,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388658798000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
