#! /bin/bash
SID=$1
SYSNO=$2
#HOST=$3
HOST=blrdevhanadb01.prod.tangoe.com
PATTERN=indexserver_blrdevhanadb01.prod.tangoe.com
>Error.log

echo "SID = $SID" >>Error.log
echo "SNO = $SYSNO" >>Error.log
echo "Hostname = $HOST" >>Error.log
echo -e "USERNAME =" >>Error.log
echo -e `whoami` >>Error.log
echo `date` >>Error.log
echo " " >>Error.log

echo "Error Info:" >>Error.log
grep -i 'error' $PATTERN.* >>Error.log

echo "PFA of the Error logs" | `mail -a Error.log -s "SAP Hana Error Logs" Bhavya.Pasupuleti@tangoe.com`

#if ![ $? -eq 0 ]
#then
#       echo "Script failed , Logs were not sent to mail"
#else
        echo "Script successful , Logs were sent to mail"
#fi
