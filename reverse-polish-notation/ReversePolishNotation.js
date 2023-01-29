function reversePolishNotation(notations) {
    const stack = [];
    let result = 0;
    let operators = "+-*/";
    for(const notation of notations) {
        if(!operators.contains(notation)) { 
            stack.push(parseInt(notation)); continue;
        }

        let first = stack.pop();
        let second = stack.pop();
        let index = operators.indexOf(notation);

        switch(index) {
            case 0:
                result = first + second;
            break;

            case 1:
                result = first - second;
            break;

            case 2:
                result = first * second;
            break;

            default:
                result = first / second;
                break;
        }
        
        stack.push(result);
    }
    return result;
}

exports.reversePolishNotation = reversePolishNotation;