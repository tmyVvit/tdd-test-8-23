1. given: a String "a"  
   when : permutation.cal("a")  
   then : return ["a"]

2. given: a String "ab"  
   when : permutation.cal("ab")  
   then : return ["ab","ba"]
   
3. given: a String "abc"  
  when : permutation.cal("abc")  
  then : return ["abc","acb","bac","bca","cab","cba"]

4. given: a string ""
   when : permutation.cal("")
   then : throw exception