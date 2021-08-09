Register Page UI

When we get in, Registration Page UI look like this, the Endpoint is "addEmployeeData".
![Screenshot (375)](https://user-images.githubusercontent.com/47950367/128652642-d490d46c-dfa9-4cab-98c5-e31897a75ce4.png)


After Entering All the required feild, we need to Click on the Submit button to Save the Data to the DataBase.
![Screenshot (378)](https://user-images.githubusercontent.com/47950367/128643975-de8bd8d4-54c6-4a89-99d5-172b752f924f.png)

After submitting the Data, this Confirmation window will open, that means your Data is Successfully saved in the DataBase.
![Screenshot (379)](https://user-images.githubusercontent.com/47950367/128643978-4931df9d-bfd9-4cc1-a7c6-13a0f101cc86.png)

You Can view your Saved Data by using the Endpoint "employee", Data will look like this
![Screenshot (380)](https://user-images.githubusercontent.com/47950367/128643979-752e9d18-539d-4cad-b1b9-84ced00002eb.png)

For the country and state field, we have created a dynamic drop down.
We have added three countries here.
![Screenshot (384)](https://user-images.githubusercontent.com/47950367/128643954-af90315f-1b19-42fe-acd2-8a404a15d020.png)

If we Select India here, the India states will appear in the state field
![Screenshot (387)](https://user-images.githubusercontent.com/47950367/128643968-518bfbd0-28f6-49f0-b8c4-0c8af6f6349e.png)


If we Select USA here, the USA states will appear in the state field
![Screenshot (385)](https://user-images.githubusercontent.com/47950367/128643959-bcbc3706-5e04-4f0f-8df1-45e3d511b66d.png)

If we Select China here, the China states will appear in the state field
![Screenshot (386)](https://user-images.githubusercontent.com/47950367/128643965-5a8e7422-e733-456e-be58-4ddb43ad6860.png)



In Some of the fields, we have Implemented a Validation.

In the name field, only alphabets are allowed, if we have inserted any special character & Numeric character, this alert message will appear

![Screenshot (381)](https://user-images.githubusercontent.com/47950367/128643944-f522cfbd-6b44-4c5c-94e2-2047f059bbaf.png)

In the Email field, If the Mail is not in proper format, error message will appear
![Screenshot (382)](https://user-images.githubusercontent.com/47950367/128643949-0bf779f5-37dd-4d99-9c84-c4b648ecb51e.png)
 
And in the Number field only Numeric Value is allowed, we are not able to add Special character and Alphabets in this field as we have given Integer "int" data for this field.

