echo "Enter the input"
read file1
i=0
while [ $i -le 102 ]
do
R1=`echo $file1 | cut -f$i -d"~"`
R2=`echo $R1 | cut -f1 -d"|"`
R3=`echo $R1 | cut -f2 -d"|"`
if [ $R3 == 's' ]
then
dt='string'
fi
if [ $R3 == 'i' ]
then
dt='integer'
fi
if [ $R3 == 'd' ]
then
dt='decimal'
fi
j=`expr 112 + $i`
echo    "<Field name=\"$R2\" nullable=\"true\" type=\"$dt\" id=\"$j\"/>"
i=`expr $i + 1`
done




#Input
#PETICION|s~TIPO_DE_PETICION|s~FLAG_PET_CRITICA|s~CLIENTE|i~TIPO_DOC_CLIENTE_PET|s~NUM_DOC_CLIENTE_PET|s~NOMBRE_CLIENTE_PET|s~AP_PATERNO_CLIENTE_PET|s~AP_MATERNO_CLIENTE_PET|s~DEUDA_CLIENTE_PET|d~FACT_VS_PAG_CLIENTE_PET|d~LINEAS_CLIENTE_PET|i~TELEF_CONT_1_CLIENTE_PET|s~TELEF_CONT_2_CLIENTE_PET|s~FLAG_PET_ADMIN|s~FECHA_CAMBIO_ESTADO|s~FECHA_ULTIMA_MODIF_PET|s~OBSERVACIONES_PET|s~NOMBRE_SOLICITANTE|s~AP_PATERNO_SOLICITANTE|s~AP_MATERNO_SOLICITANTE|s~TIPO_DOC_SOLICITANTE|s~NUM_DOC_SOLICITANTE|s~TELEFONO_SOLICITANTE|s~COD_ESTADO_PET|s~FECHA_HORA_REGISTRO|s~USUARIO_REG|1~USUARIO_MOD|s~TIPO_CANAL_DE_VENTA|s~CANAL_DE_VENTA|s~PUNTO_DE_VENTA|s~ID_VENDEDOR|i~NOMBRE_DEL_VENDEDOR|s~AP_PATERNO_VENDEDOR|s~AP_MATERNO_VENDEDOR|s~AGRUP_1|i~TIPO_OC_AGRUP_1|s~ESTADO_AGRUP_1|s~CLIENTE_AGRUP_1|i~TIPO_DOC_CLIENTE_AGRUP_1|s~NUM_DOC_CLIENTE_AGRUP_1|s~NOMBRE_CLIENTE_AGRUP_1|s~AP_PATERNO_CLIENTE_AGRUP_1|s~AP_MATERNO_CLIENTE_AGRUP_1|s~DEUDA_CLIENTE_AGRUP_1|d~FACT_VS_PAG_CLIENTE_AGRUP_1|d~LINEAS_CLIENTE_AGRUP_1|i~TELEF_CONT_1_CLIENTE_AGR_1|s~TELEF_CONT_2_CLIENTE_AGR_1|s~CUENTA_AGRUP_1|i~TIPO_DOC_CUENTA_AGRUP_1|s~NUM_DOC_CUENTA_AGRUP_1|s~NOMBRE_CUENTA_AGRUP_1|s~AP_PATERNO_CUENTA_AGRUP_1|s~AP_MATERNO_CUENTA_AGRUP_1|s~TIPO_PC_AGRUP_1|s~SUBTIPO_PC_AGRUP_1|s~TIPO_LINEA_AGRUP_1|s~INSCRIPCION_AG|s~TELEFONO_AGRUP_1|s~SEGMENTOEA_AGRUP_1|s~DEUDA_LA|d~FACT_VS_PAG_LINEA_AGRUP_1|d~DIR_INSTALACION_COMPLETA_AGRUP_1|s~DIR_INSTALACION_PARCIAL_AGRUP_1|s~DEPARTAMENTO_AGRUP_1|s~PROVINCIA_AGRUP_1|s~DISTRITO_AGRUP_1|s~MDF-ARMARIO_AGRUP_1|s~OPERACIA_COMERCIAL_AGRUP_1|s~PRODUCTOS_SERVICIOS_AGRUP_1|s~AGRUP_2|i~TIPO_OC_AGRUP_2|s~ESTADO_AGRUP_2|s~CLIENTE_AGRUP_2|i~CUENTA_AGRUP_2|i~TIPO_PC_AGRUP_2|s~SUBTIPO_PC_AGRUP_2|s~TIPO_LINEA_AGRUP_2|s~INSCRIPCION_AGRUP_2|s~TELEFONO_AGRUP_2|s~DIR_INSTALACION_COMPLETA_AGRUP_2|s~DIR_INSTALACION_PARCIAL_AGRUP_2|s~DEPARTAMENTO_AGRUP_2|s~PROVINCIA_AGRUP_2|s~DISTRITO_AGRUP_2|s~MDF-ARMARIO_AGRUP_2|s~OPERACIA_COMERCIAL_AGRUP_2|s~PRODUCTOS_SERVICIOS_AGRUP_2|s~AGRUP_3|i~TIPO_OC_AGRUP_3|s~ESTADO_AGRUP_3|s~OPERACIA_COMERCIAL_AGRUP_3|s~PRODUCTOS_SERVICIOS_AGRUP_3|s~PUNTAJE_DIRECCION_DE_RIESGO|i~VALOR_PETICIA_AMOUNT|d~NOMBRE_ARCHIVO|s~ADICIONAL_1|s~ADICIONAL_2|s~ADICIONAL_3|s~ADICIONAL_4|i~ADICIONAL_5|d~