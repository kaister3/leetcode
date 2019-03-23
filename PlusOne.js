/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function (digits) {
    var carry = 1;
    var i = digits.length-1;
    while(i>=0){
        digits[i] += carry;
        carry = digits[i] / 10;
        digits[i] = digits[i] % 10;
        i--;
    }
    if (carry > 0){
        digits.unshift(1);
    }
    return digits;
}