<div id="Content" class="container">
<!-- Main menu in one row (e.g., controller entry points -->
    <g:if test="${!layout_nomainmenu}">

        <g:if test="${pageProperty(name: 'page.menubar')}">
            <g:pageProperty name="page.menubar"/>
        </g:if>
        <g:else>
            <g:render template="/_menu/menubar"/>
        </g:else>

    </g:if>

<!-- Secondary menu in one row (e.g., actions for current controller) -->
    <g:if test="${!layout_nosecondarymenu}">
        <g:if test="${pageProperty(name: 'page.submenubar')}">
            <g:pageProperty name="page.submenubar"/>
        </g:if>
    </g:if>

<!-- print system messages (infos, warnings, etc) - not validation errors -->
    <g:if test="${flash.message && !layout_noflashmessage}">
        <div class="alert alert-info">${flash.message}</div>
    </g:if>

<!-- Show page's content -->
    <g:layoutBody/>
    <g:pageProperty name="page.body"/>
</div>