var x = [21,25,22,28,23,24,27,26,29];


const findMissing = num => {
    const max = Math.max(...num);
    const min = Math.min(...num);
    const missing = [];
    let found = false;

    for(var i=min;i<=max;i++) {
        if(min)
        if(!num.includes(i)) {
            missing.push(i);
            found = true;
        } 
    }

    if(!found) {
        missing.push(max+1);    
    }
    //I assume that, only the end number
    //(not both start or end can be missing if start begins with any random number)
    //can be missing

    return missing;
}

console.log(findMissing(x));




