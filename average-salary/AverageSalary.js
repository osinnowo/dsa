/**
 * @param {number[]} salary
 * @return {number}
 */
var average = function(salary) {
    if(salary.length < 3) { return 0; }
    salary.sort((a, b) => a - b);
    if(salary.length == 3) { return salary[1]; }
    
    console.log(salary);
    let index = 1;
    let totalSalary = 0;
    while(index < salary.length - 1) {
        totalSalary += salary[index];
        index++;
    }
    return totalSalary / (index - 1);
};