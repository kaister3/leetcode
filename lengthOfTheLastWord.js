/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function (s) {
    var left = 0;
    var right = s.length-1;
    var count = 0;
    while (s[left] == ' ') ++ left;
    while (s[right] == ' ') -- right;
    for (let i = left; i <= right; i++) {
        if (s[i] == ' ') count = 0;
        else count ++;
    }
    return count;
};