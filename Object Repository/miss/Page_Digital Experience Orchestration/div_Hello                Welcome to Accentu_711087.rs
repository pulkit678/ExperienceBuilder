<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Hello                Welcome to Accentu_711087</name>
   <tag></tag>
   <elementGuidId>dd199386-4c51-4ad6-a3d2-b83d57e7237a</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>container-fluid</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
			

				
          
	            
                Hello!
                
		
		
			Welcome to Accenture Digital Access.
Enter your credentials to get started.
		
		

    

				
				
				
			    
			    
				
				
				
							

















    
	    
		
        
        
        
			
	        
        
      
    

    
    
    
	    
        
    

	
	


	
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
    









						
            
           	

						

		
	
		

			
		

	
			
			
			
	

	
		
		
		
		
		
		
	

	
		
		
		
		
		
		
	

	
 	$(document).ready(function(){
		$('.main-link').click(function(){
			$('.main-link').next().hide();
			$(this).next().toggle('fast');
			var w = $(document).width();
			var h = $(document).height();
			$('.overlay').css(&quot;width&quot;,w+&quot;px&quot;).css(&quot;height&quot;,h+&quot;px&quot;).show();
		});
		$('.overlay').click(function(){$(this).hide();$('.main-link').next().hide();});
		
		
	});
    function myFunction(key, value, name) {
            var object = document.getElementById(name);
            var domain = object.value;

            if (domain != &quot;&quot;) {
                document.location = &quot;../../../../commonauth?idp=&quot; + key + &quot;&amp;authenticator=&quot; + value +
                        &quot;&amp;sessionDataKey=c1d55a65-7c62-4842-9a47-9e539e39de92&amp;domain=&quot; +
                        domain;
            } else {
                document.location = &quot;../../../../commonauth?idp=&quot; + key + &quot;&amp;authenticator=&quot; + value +
                        &quot;&amp;sessionDataKey=c1d55a65-7c62-4842-9a47-9e539e39de92&quot;;
            }
    }

    function handleNoDomain(key, value) {
	    	
            document.location = &quot;../../../../commonauth?idp=&quot; + key + &quot;&amp;authenticator=&quot; + value +
        		&quot;&amp;sessionDataKey=c1d55a65-7c62-4842-9a47-9e539e39de92&quot; + &quot;&quot;;
    }

	    window.onunload = function(){};
	


					
      </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;login-bg&quot;]/div[@class=&quot;container-fluid&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div</value>
   </webElementXpaths>
</WebElementEntity>
