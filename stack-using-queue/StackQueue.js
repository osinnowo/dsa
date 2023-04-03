var StackQueue = function() {
    this.stack = [];
};

/** 
 * @param {number} x
 * @return {void}
 */
StackQueue.prototype.push = function(x) {
    this.stack.push(x);
};

/**
 * @return {number}
 */
StackQueue.prototype.pop = function() {
    return this.stack.pop();
};

/**
 * @return {number}
 */
StackQueue.prototype.top = function() {
    return this.stack[this.stack.length - 1];
};

/**
 * @return {boolean}
 */
StackQueue.prototype.empty = function() {
    return this.stack.length === 0;
};