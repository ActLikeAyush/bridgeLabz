function getData(data){
    return new Promise((resolve, reject)=>{
         setTimeout(()=>{
                console.log(`data ${data} fetched`);
                resolve("success");
            }, 2000);
    });
}

getData(1)
    .then((res)=>{
        return getData(2);
    })
    .then((res)=>{
    return getData(3)
    });
console.log("safi");

setTimeout(() => {
   console.log("Asd");
}, 2000);

console.log("something");

setTimeout(() => {
   console.log("adfd");
}, 2000);

console.log("ayush");
