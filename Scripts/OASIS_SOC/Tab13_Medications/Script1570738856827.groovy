import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/btn_Tab13_Medications'))

WebUI.delay(5)

//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Drug_Regimen_Review/chb_0 - No'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Drug_Regimen_Review/chb_Yes'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Drug_Regimen_Review/chb_NA'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Medication_Follow-up/chb_0 _-_No'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Medication_Follow-up/chb_1_-_Yes'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Patient_Caregiver_High-Risk_Drug_Education/chb_0 - No'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Patient_Caregiver_High-Risk_Drug_Education/chb_1 - Yes'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Patient_Caregiver_High-Risk_Drug_Education/chb_NA - Patient'))
//
//WebUI.delay(5)
//
//WebUI.comment('')
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Management_of_Oral_Medications/chb_0 - Able_to_independently_take_the_correct_oral_medication(s)_and_proper_dosage(s)_at_the_correct_times'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Management_of_Oral_Medications/chb_1 - Able_to_take_medication(s)_at_the_correct_times_if'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Management_of_Oral_Medications/chb_2 - Able_to_take_medication(s)'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Management_of_Oral_Medications/chb_3 - Unable_to_take_medication_unless_administered_by_another_person'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Management_of_Oral_Medications/chb_NA - No_oral_medications_prescribed'))
//
//WebUI.delay(5)
//
//WebUI.comment('')
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Management_of_Injectable_Medications/chb_0 - Able_to_independently_take_the_correct_medication(s)'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Management_of_Injectable_Medications/chb_1 - Able_to_take_injectable_medication(s)_at_the_correct_times_if'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Management_of_Injectable_Medications/chb_2 - Able_to_take_medication(s)'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Management_of_Injectable_Medications/chb_3 - Unable_to_take_injectable_medication'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Management_of_Injectable_Medications/chb_NA - No_injectable_medications_prescribed'))
//
//WebUI.delay(5)
WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/chb_Venous_Access_and_Intravenous_Therapy'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Purpose/chb_Antibiotic_therapy'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Purpose/chb_Hydration'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Purpose/chb_Parenteral_nutrition'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Purpose/chb_Pain_control'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Purpose/chb_Chemotherapy'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Purpose/chb_Maintain_venous_access'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Purpose/txt_Other'), '')

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Catheter_type/chb_Short_catheter'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Catheter_type/chb_Midline'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Catheter_size_gauge_length/chb_18'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Catheter_size_gauge_length/chb_20'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Catheter_size_gauge_length/chb_22'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Catheter_size_gauge_length/chb_24'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Catheter_size_gauge_length/chb_Other'), 
    '')

WebUI.delay(5)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Insertion_site_location/Arm/chb_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Insertion_site_location/Arm/chb_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Insertion_site_location/Hand/chb_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Insertion_site_location/Hand/chb_Right'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Insertion_site_location/Hand/txt_Other'), 
    'OASIS')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/txt_Date_inserted'), 
    '10/16/2019')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/txt_IV_site_change_frequency'), 
    '')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/txt_Dressing_change_frequency'), 
    '')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Condition_of_insertion_site/chb_WNL'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/Condition_of_insertion_site/txt_WNL'), 
    '')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/txt_Flush_solution'), 
    '')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Peripheral_Venous_Access/txt_Flush_frequency'), 
    '')

WebUI.delay(6)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/CVAD_catheter/chb_PICC_line'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/CVAD_catheter/chb_Hickman'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/CVAD_catheter/chb_Broviac'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/CVAD_catheter/chb_Groshong'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/CVAD_catheter/chb_Permacath'))

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Number_of_lumens/chb_Single'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Number_of_lumens/chb_Double'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Number_of_lumens/chb_Triple'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Peripheral/chb_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Peripheral/chb_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Subclavian/chb_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Subclavian/chb_Right'))

WebUI.comment('Jungular')

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Jugular/chb_Left'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Jugular/chb_Right'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Jugular/txt_Other'), 
    'keep right')

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Date_inserted'), 
    '10/16/2019')

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/txt_Dressing_change_frequency'), 
    'dressing change')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/txt_Date_last_dressing_changed'), 
    '10/15/2019')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Condition_of_insertion_site/chb_WNL'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/Condition_of_insertion_site/txt_WNL'), 
    '')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/txt_Flush_frequency'), 
    '')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Central_Venous_Access_Device/txt_Flush_solution'), 
    '')

WebUI.delay(6)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Port_device/chb_Portacath'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Port_device/chb_Bard_port'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Port_device/chb_Power_port'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Port_device/txt_Other'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Port_reservoir/chb_Single_chamber'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Port_reservoir/chb_Double_chamber'))

WebUI.delay(2)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Huber_needle_length/chb_0_50'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Huber_needle_length/chb_0_75'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Huber_needle_length/chb_1_00'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Huber_needle_length/chb_1_25'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Huber_needle_length/chb_1_50'))

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Huber_needle_gauge/chb_19_gauge'))

WebUI.delay(4)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Huber_needle_gauge/chb_20_gauge'))

WebUI.delay(4)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Huber_needle_gauge/chb_22_gauge'))

WebUI.delay(4)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Huber_needle_gauge/chb_25_gauge'))

WebUI.delay(4)

WebUI.comment('')

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/txt_Implant_location'), 
    '')

WebUI.delay(4)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/txt_Date_implanted'), 
    '10/17/2019')

WebUI.delay(4)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/txt_Dressing_change_frequency'), 
    '')

WebUI.delay(4)

WebUI.click(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Condition_of_important_site/chb_WNL'))

WebUI.delay(4)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/Condition_of_important_site/txt_WNL'), 
    '')

WebUI.delay(4)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/txt_Flush_solution'), 
    '')

WebUI.delay(4)

WebUI.setText(findTestObject('OASIS_SOC/Tab13_Medications/Venous_Access_and_Intravenous_Therapy/Implanted_Port_CVAD/txt_Flush_frequency'), 
    '')

WebUI.delay(10)

