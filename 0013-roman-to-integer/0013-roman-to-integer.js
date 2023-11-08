/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let romanmap = new Map();
    romanmap.set('I',1).set('V',5).set('X',10).set('L',50).
    set('C',100).set('D',500).set('M',1000).set('IV',4).
    set('IX',9).set('XL',40).set('XC',90).set('CD',400).set('CM',900);
    let number = 0;
    for(let i = 0 ; i < s.length ; i++)
    {
        if(s[i]==='I'&&s[i+1]!='I'&&s[i+1]!=undefined)
        {
            number+=romanmap.get(s[i]+s[i+1]);
            i++;
            continue;
        }
        if(s[i]==='X'&&s[i+1]==='L'||s[i]==='X'&&s[i+1]==='C' ||
        s[i]==='C'&&s[i+1]==='D' || s[i]==='C'&&s[i+1]==='M')
        {
            number+=romanmap.get(s[i]+s[i+1]);
            i++;
            continue;
        }
        else{
            number+=romanmap.get(s[i]);
        }
    }
    return number;
};