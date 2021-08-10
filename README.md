
Register Page UI

When we get in, Registration Page UI look like this, the Endpoint is "addEmployeeData".
![1](https://user-images.githubusercontent.com/47950367/128903807-ce8ea4ea-6c29-42e9-a61c-f30c2ef62726.JPG)


After Entering All the required feild, we need to Click on the Submit button to Save the Data to the DataBase.
![2](https://user-images.githubusercontent.com/47950367/128903915-472bee62-630c-497e-b357-e9fce72f51b4.JPG)


After submitting the Data, this Confirmation window will open, that means your Data is Successfully saved in the DataBase.
![3](https://user-images.githubusercontent.com/47950367/128903969-26df71bb-d7dc-44cd-aa63-36f04bb8c651.JPG)

You Can view your Saved Data by using the Endpoint "employee", Data will look like this
![4](https://user-images.githubusercontent.com/47950367/128904131-d1659d70-171d-4572-8acc-61b1dc8391c7.JPG)

For the country and state field, we have created a dynamic drop down.
We have added three countries here.
![8](https://user-images.githubusercontent.com/47950367/128904314-6b4eff80-6728-491b-a592-4192ba894018.JPG)

If we Select India here, the India states will appear in the state field
![11](https://user-images.githubusercontent.com/47950367/128904369-21650392-7091-4f0c-adf2-5b6d44df5c7b.JPG)


If we Select USA here, the USA states will appear in the state field
![9](https://user-images.githubusercontent.com/47950367/128904449-a50de3d8-c7bd-41df-8e78-6d4665420300.JPG)

If we Select China here, the China states will appear in the state field
![10](https://user-images.githubusercontent.com/47950367/128904581-7c439c9d-0df2-47df-9950-870bdecf1f17.JPG)



In Some of the fields, we have Implemented a Validation.

In the name field, only alphabets are allowed, if we have inserted any special character & Numeric character, this alert message will appear

![5](https://user-images.githubusercontent.com/47950367/128904625-4890a151-c302-425d-93f9-654ac17c4bac.JPG)

In the Email field, If the Mail is not in proper format, error message will appear
![6](https://user-images.githubusercontent.com/47950367/128904654-05ff7423-beeb-4c57-a8ba-2731c1c51a7d.JPG)
 
And in the Number field only Numeric Value is allowed, we are not able to add Special character and Alphabets in this field as we have defined Integer "int" datatype for this field.

