# dev_HazeBankCreditSystem
Api to calculate Instalment of Credit and generate PDF raport

### Require
- Maven
- Java SE7

### How to start?
Use this command in repository folder.
``` 
mvn jetty:run 
```
### Dev requires:
 - node.js 
 - webpack
 - node-sass (any to compile sass file)
# BackEnd:

### Package:
##### Filter:
- Filters : filter request.
###### Controler:
 -  AccessControler: execute Access.
 -  RestControler: change stateObject.
 -  AuthorizeControler: Move to Authorize System.
###### Model:
- autorizeSystem: authorize User.
- creditSystem: calculate credit.
- Repository: connect database.
###### Services:
 - ServiceMenager     :  Menagment services.
 - ValidateService    :  Validate output data Model. 
 - ConvertService     :  Convert output data to Object Credit.
 - CalculateService   :  Calculate Instalment.
 - PdfBuilderService  :  Create PDF raport.
 -RowsBuilderService  :  Set object to cell and add to List rows.
###### Servlet:
- Servlet : execute Request and Response.
##### View:
 - View : show value.
##### Domain:
 - AccessRules : accessRules to view,model etc.
 - ActionRules: Strategy access.
 - ActionAuthorize : Strategy authorize.
 - FormUser : Request inject to Object.
 - Credit: Credit objects.
 - User: Register user.
# FrontEnd:

### Modules:
- ExceptionService : build Exception.
- AjaxService: AJAX service;
- RenderService: Inject to view.
- ValidatorService: valid input value.

### Release list:
 #### 1.1.0
Add Credit System
### 1.2.0
Add AccessSystem
Add AuthorizeSystem
