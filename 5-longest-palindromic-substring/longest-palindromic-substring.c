char* longestPalindrome(char* s) {
    int start = 0, maxLen = 1;
    int len = strlen(s);
    for (int i = 0; i < len; i++) {
        int l = i, r = i;
        while (l >= 0 && r < len && s[l] == s[r]) {
            int curLen = r - l + 1;
            if (curLen > maxLen) {
                start = l;
                maxLen = curLen;
            }
            l--; r++;
        }
        l = i; r = i + 1;
        while (l >= 0 && r < len && s[l] == s[r]) {
            int curLen = r - l + 1;
            if (curLen > maxLen) {
                start = l;
                maxLen = curLen;
            }
            l--; r++;
        }
    }
    char* res = (char*)malloc((maxLen + 1) * sizeof(char));
    strncpy(res, s + start, maxLen);
    res[maxLen] = '\0';
    return res;
}