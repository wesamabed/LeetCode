/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0)
    {
        return false;
    }
    else if (x >= 0 && x <= 9)
    {
        return true;
    }
    else
    {
        let palindrome=0;
        let reminder = 0;
        let number =x;
        while(x != 0)
        {
            reminder = x%10;
            palindrome = palindrome*10;
            palindrome = palindrome+reminder
            x = parseInt(x/10);
            
        }
        if(palindrome === number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
};