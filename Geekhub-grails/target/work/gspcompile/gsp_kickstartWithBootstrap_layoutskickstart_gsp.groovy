import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.0.0')
class gsp_kickstartWithBootstrap_layoutskickstart_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.0.0/grails-app/views/layouts/kickstart.gsp" }
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
invokeTag('layoutTitle','g',3,['default':(meta(name:'app.name'))],-1)
})
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(5)
expressionOut.print(resource(plugin: 'kickstart-with-bootstrap', dir:'images',file:'favicon.ico'))
printHtmlPart(6)
invokeTag('require','r',17,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('require','r',17,['modules':("bootstrap_utils")],-1)
printHtmlPart(7)
invokeTag('layoutResources','r',17,[:],-1)
printHtmlPart(2)
invokeTag('layoutHead','g',17,[:],-1)
printHtmlPart(8)
})
invokeTag('captureHead','sitemesh',22,[:],1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('render','g',27,['template':("/_menu/navbar")],-1)
printHtmlPart(10)
if(true && (pageProperty(name:'page.header'))) {
printHtmlPart(11)
invokeTag('pageProperty','g',32,['name':("page.header")],-1)
printHtmlPart(2)
}
else {
printHtmlPart(12)
invokeTag('render','g',35,['template':("/layouts/header")],-1)
printHtmlPart(13)
}
printHtmlPart(7)
invokeTag('render','g',36,['template':("/layouts/content")],-1)
printHtmlPart(14)
if(true && (pageProperty(name:'page.footer'))) {
printHtmlPart(15)
invokeTag('pageProperty','g',42,['name':("page.footer")],-1)
printHtmlPart(2)
}
else {
printHtmlPart(12)
invokeTag('render','g',43,['template':("/layouts/footer")],-1)
printHtmlPart(13)
}
printHtmlPart(16)
if(true && (pageProperty(name:'page.include.bottom'))) {
printHtmlPart(11)
invokeTag('pageProperty','g',52,['name':("page.include.bottom")],-1)
printHtmlPart(2)
}
else {
printHtmlPart(17)
invokeTag('render','g',57,['template':("/_common/modals/registerDialog"),'model':([item: item])],-1)
printHtmlPart(2)
}
printHtmlPart(18)
invokeTag('layoutResources','r',59,[:],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1384886130000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
