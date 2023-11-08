/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let stack =[];
    for (let i = 0 ; i<s.length; i++)
    {
        if(s[i]=='('||s[i]=='{'||s[i]=='[')
        {
            stack.push(s[i]);
            continue;
        }
        else{
            let x = stack.pop();
            if(x+s[i]==='()'||x+s[i]==='[]'||x+s[i]==='{}')
            {

                continue;
            }
            else{
                return false;
            }
        }
    }
    if(stack.length===0)
    {
        return true;
    }
    else{
        return false;
    }    
};