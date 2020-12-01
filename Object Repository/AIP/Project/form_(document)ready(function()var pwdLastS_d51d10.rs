<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>form_(document)ready(function()var pwdLastS_d51d10</name>
   <tag></tag>
   <elementGuidId>3ec328ed-9285-41ad-a358-bc5e310a69ce</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//form[@id='loginForm']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>form</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>action</name>
      <type>Main</type>
      <value>/samlsso</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>method</name>
      <type>Main</type>
      <value>post</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>loginForm</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>autocomplete</name>
      <type>Main</type>
      <value>off</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
				
			    
			    
				
				
				
							

















    
	    
		
        
        
        
			
	        
        
      
    

    
    
    
	    
        
    

	
	


	
	$(document).ready(function(){
			var pwdLastSetZero = &quot;false&quot;;
			var username=sessionStorage.getItem(&quot;usernameStorage&quot;);
			var issuer=&quot;saml.issuer.web.xaas&quot;;
			if(pwdLastSetZero &amp;&amp; pwdLastSetZero==&quot;true&quot; ) {
				$(&quot;#username_rf&quot;).val(username);
				//$(&quot;#issuer_rf&quot;).val(issuer); //custom layout
				$(&quot;#pwdLastSetForm&quot;).submit();
			}
	});

	$(&quot;body&quot;).on( &quot;click&quot;, &quot;#btnSubmitLogin&quot;, function(event) {
		if(!$(&quot;#usernameShown&quot;).val() || !$(&quot;#password&quot;).val()){
			event.preventDefault();
			var msg = &quot;All fields are required&quot;;
			$(&quot;.errorRequired&quot;).html(&quot;&lt;div class='uil-text-danger uil-warning-icon' role='alert'>&quot;+msg+&quot;&lt;/div>&quot;);
		} else {
			appendTenantDomain(event);
		}
	});

	function appendTenantDomain(e) {
		e.preventDefault();
		var store = 'DIR/';
		var username = document.getElementsByName(&quot;usernameShown&quot;)[0].value;
		var appendTenantDomainTwice = &quot;null&quot;;
		var userWithDomain = &quot;&quot;;
		var tenantDomain = $(&quot;#tenantDomain&quot;).val();
		if(appendTenantDomainTwice &amp;&amp; appendTenantDomainTwice==&quot;true&quot;) {
			userWithDomain = store + username.trim() + &quot;@&quot; + tenantDomain + &quot;@&quot; + tenantDomain;
		} else {
			userWithDomain = store + username.trim() + &quot;@&quot; + tenantDomain;
		}
		



// 		console.log(&quot;VAULT - appendTenantDomainTwice: &quot;+appendTenantDomainTwice);
// 		console.log(&quot;ENV - WSO2IS_VAULT_ENDPOINT: &quot;+vaultEndpoint);
// 		console.log(&quot;ENV - WSO2IS_VAULT_TOKEN: &quot;+vaultToken);
// 		console.log(&quot;ENV - WSO2IS_VAULT_SECRET: &quot;+vaultSecret);
// 		console.log(&quot;tenantDomain: &quot;+tenantDomain);

		//pwdLastSet
		sessionStorage.setItem(&quot;usernameStorage&quot;, userWithDomain);
		document.getElementsByName(&quot;username&quot;)[0].value = userWithDomain;
		document.getElementById(&quot;loginForm&quot;).submit();
	}
	
	function goBack() {
        window.history.back();
    }

    
    
       Forgot Credentials?
    

    
      Enter
    









						
            
           	

						

		</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;loginForm&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//form[@id='loginForm']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='panelLoginRow']/form</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Hello!'])[1]/following::form[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//form</value>
   </webElementXpaths>
</WebElementEntity>
