import sys 
a=[23,32,41,10,15]  
diff=[]
indices=[]
k=2

a.sort()
#print(a)
i=0
differ=0
while(i<len(a)-1):
   differ=a[i+1]-a[i]
   diff.append(differ)
   i=i+1

s=sorted(range(len(diff)), key=lambda k: diff[k], reverse=True)
diff.sort(reverse=True)
#print(s)
j=0
#print(diff)
sum=a[s[0]]-a[0]
k=k-1
for i in range(1,len(s)):
   if(k==1):
      j=i-1
      break
   else:
  #    print(a[s[i]],a[s[i-1]+1])
      di=a[s[i]]-a[s[i-1]+1]
 #     print(di)
      sum=sum+di
   k=k-1
#print(a[s[j]+1])
sum=sum+(a[len(a)-1]-a[s[j]+1])
print(sum) 
      