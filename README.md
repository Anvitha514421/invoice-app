# Invoice App

It is an application to create and manage invoices. One need to create an account and login into the
application. Once logged in they will view a dashboard highlighting some statistics if the data 
exists. 


You need `google-services.json` to make this project work.

## Follow these steps
- Go to https://console.firebase.google.com/
- You can signup with your google account.
- If you already have a project in firebase you can use it or you can create a new project.
- Once you have your firebase project, make sure you enable **Firestore and Authentication with Email and Password**.
- Once the project is created, select android app as the option to add a new app.
- After adding the app you can download the config file that is `google-services.json`.
- Now you can clone this repository and paste the file inside app folder.
- That's it sync your project with gradle files and it should work.

In the event that no data exists, one would create them in their respective screens. 

This includes 

**Creating a dashboard**
 In this dashboard screen we can see the below details:

•	The total number of invoices generated.
•	The Received Amount.
•	The Total Amount.
•	Number of pending invoices.
•	Pending Amount.


 **Creating a customer**
 
   The Business owners must add the customers to this screen by specifying their name, address, contact and email. 
   The list of all the customers can be seen on this screen. The business owners can add/update and delete the customer.

 **Creating a busines**
 
 The business screen is for the business owners to add their businesses. 
 This app allows the owners to add up to 5 businesses. The customers can be added to their respective business areas.
 The owners can add, update and delete the business at any point in time.


 **Creating a tax**
 
 The owners must specify and manage the type and percent of tax they are applying to the customers on their business.
 

 **Creating an invoice**
 
 The invoices are generated to the customers based on the quantity of the items purchased, the price of the item and the tax. 
 

