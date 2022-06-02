var x = [23,25,29,28,21,24,27,26,30];


const findMissing = num => {
    const max = Math.max(...num);
    const min = Math.min(...num);
    const missing = [];

    for(var i=min;i<=max;i++) {
        if(min)
        if(!num.includes(i)) {
            missing.push(i);
        }
    }

    return missing;
}

console.log(findMissing(x));




