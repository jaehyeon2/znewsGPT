<#import "/apps/layout/abilistsErrorsLayout.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<div class="row fw-row row1" style="padding: 0px;">
<div class="col-md-12 fw-row" style="padding: 70px; text-align: center;">
    <h2><b>Oops! This an error message</b></h2>
    <h4><#include "/apps/common/errorMessage.ftl"/></h4>
    <br/>
    <img src="/static/apps/img/bi02.png" alt="abilists">
</div>
</div>

<#include "/apps/common/abilistsLoadJs.ftl"/>

</@layout.myLayout>