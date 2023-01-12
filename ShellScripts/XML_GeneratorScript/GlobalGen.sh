echo "Enter the number of Global vars"
read n
echo "Enter the Global names input"
read file1
i=0
j=8
while [ $i -le $n ]
do
Global_name=`echo $file1 | cut -f$i -d"~"`
echo "<Global id=\"$j\" initialValue=\"0\" name=\"$Global_name\" type=\"integer\" serializable=\"false\"/>"
j=`expr $j + 1`
i=`expr $i + 1`
done
