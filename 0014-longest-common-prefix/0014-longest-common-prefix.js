/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let first = strs[0];
    let prefix='';
    let exist;
    for (let x = 0; x < first.length; x++)
    {
        exist=true;
        
        for(let i = 1; i < strs.length; i++)
        {
            if(first[x]===strs[i][x])
            {
                continue;
            }
            else{
                exist = false;
                
                break;
            }
           
        }
        if(exist){
            prefix = prefix+first[x];
        }
        else
        {
            break;
        }
        
          

    }
    return prefix;
};