cp  hibernate.reveng.xml hibernate.reveng.backup.xml
for ((i=1;i<=400;i++)); 
do 

sed -i -e "s/\<column name\=\"${i}\"\>/\<column name\=\"${i}\" property\=\"i${i}\"\>/g"  hibernate.reveng.backup.xml

done
sed -i -e "s///g"  hibernate.reveng.backup.xml
