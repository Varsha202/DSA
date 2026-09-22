int lengthOfLastWord(char* s)
{
    int i,len,last=0;
    len=strlen(s);
    for(i=len-1;i>=0;i--)
    {
        if(s[i]!=' ')
        {
            last++;
        }
        if(s[i]==' ' && last!=0)
        {
            break;
        }
    }
    return last;
}