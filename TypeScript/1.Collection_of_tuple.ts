let  customer_records:[String,number,String,String][];
customer_records=[["Rohan",1234,"Male","California"],["John",2345,"Male","Vegus"],["Nancy",3456,"Female","Chicago"]];
customer_records.push(["Ria",2345,"Female","Losangels"]);
customer_records.pop();
for(var index of customer_records){
    console.log("Customer name is "+index[0]+" with "+index[1] +" as phone number, living in  "+index[3]);
}

/*
Customer name is Rohan with 1234 as phone number, living in  California
Customer name is John with 2345 as phone number, living in  Vegus   
Customer name is Nancy with 3456 as phone number, living in  Chicago
*/
