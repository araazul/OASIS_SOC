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

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/btn_Tab10_Elimination'))

WebUI.delay(10)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/chb_Incontinence'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/chb_Stress_incontinence'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/chb_Urgency'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/chb_Frequency'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/chb_Dysuria'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/chb_Retention'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/chb_Polyuria'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/chb_Nocturia'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/chb_Oliguria_Anuria'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/chb_Hematuria'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Abnormal_status/txt_Other'), 'Abnormal Status')

WebUI.delay(5)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_Color/chb_Yellow'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_Color/chb_Straw'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_Color/chb_Amber'))

not_run: WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_Color/txt_Other'), 'for automation')

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_clarity/chb_Clear'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_clarity/chb_Cloudy'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_clarity/chb_Blood-tinged'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_clarity/chb_Concentrated'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_clarity/chb_Sediment'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_clarity/chb_Mucous'))

WebUI.delay(3)

WebUI.comment('Urine color')

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_odor/chb_No'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_odor/chb_Yes'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Urine_odor/txt_Yes'), 'and I said Yes')

WebUI.delay(5)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/chb_Indwelling_urinary_catheter'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Catheter_type/chb_Urethral'))

//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/chb_Intermittent_catheterization'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/Catheter_type/chb_Female_straight_tip'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/Catheter_type/chb_Male_straight_tip'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/Catheter_type/chb_Coude_tip'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/Catheter_type/txt_Other'))
//
//WebUI.delay(5)
//
//WebUI.comment('')
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/Catheter_size(Fr)/chb_6'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/Catheter_size(Fr)/chb_8'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/Catheter_size(Fr)/chb_10'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/Catheter_size(Fr)/chb_12'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/Catheter_size(Fr)/chb_14'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/Catheter_size(Fr)/txt_Other'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Intermittent_catheterization/txt_Frequency'))
//
//WebUI.delay(5)
//
//WebUI.comment('')
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/chb_External_urinary_catheter'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/External_Urinary_Catheter/chb_Latex_catheter'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/External_Urinary_Catheter/chb_Silicone_catheter'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/External_Urinary_Catheter/txt_Other_1'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/External_Urinary_Catheter/chb_Daily'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/External_Urinary_Catheter/txt_Other_2'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/External_Urinary_Catheter/chb_Leg_Bag'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/External_Urinary_Catheter/chb_Bedside_Bag'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/chb_Peritoneal_dialysis'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/chb_Continuous_Ambulatory_Peritoneal_Dialysis-(CAPD)'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/chb_Automated_Peritoneal_Dialysis_(APD)'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/chb_Continuous_Cycler_Peritoneal_Dialysis_(CCPD)'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/chb_Nocturnal_Intermittent_Peritoneal_Dialysis_(NIPD)'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/Dialysate/chb_0_5'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/Dialysate/chb_1_5'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/Dialysate/chb_2_5'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/Dialysate/chb_4_25'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/txt_PD_schedule'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/txt_Dwell_time'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/txt_Site_condition'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/txt_APD_machine'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/Peritoneal_dialysis_performed_by/chb_Patient'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/Peritoneal_dialysis_performed_by/chb_Caregiver'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Peritoneal_Dialysis/Peritoneal_dialysis_performed_by/chb_SN'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/chb_Hemodialysis'))
//
//WebUI.delay(3)
//
//WebUI.comment('wala pang test objects')
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/AV_shunt/chb_RA'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/AV_shunt/chb_LA'))
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/AV_shunt/txt_Other'), 
//    'automation')
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Thrill_strong/chb_Yes'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Thrill_strong/chb_No'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Bruit_present/chb_Yes'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Bruit_present/chb_No'))
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/txt_shunt_care'), 
//    'automation')
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Patient_has_Permacath/chb_Yes'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Patient_has_Permacath/chb_No'))
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/txt_Insertion_date'), 
//    'Testing')
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/txt_Permacath_dressing_change'), 
//    'Okay')
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Dialysis_schedule/chb_Mon'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Dialysis_schedule/chb_Tue'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Dialysis_schedule/chb_Wed'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Dialysis_schedule/chb_Thu'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Dialysis_schedule/chb_Fri'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Dialysis_schedule/chb_Sat'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Dialysis_schedule/chb_Sun'))
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Dialysis_center/txt_Dialysis_center'), 
//    'Villasis Dialysis Center')
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Hemodialysis/Dialysis_center/txt_Phone'), 
//    '098765432123')
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/chb_Urinary_ostomy'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Urinary_Ostomy/chb_Nephrostomy'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Urinary_Ostomy/chb_Urostomy'))
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Urinary_Ostomy/txt_Other'), 
//    'other')
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Urinary_Ostomy/Bag_change_frequency/txt_days'), 
//    '2')
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Urinary_Ostomy/Bag_change_frequency/txt_Dressing_change_frequency'), 
//    '12')
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Urinary_Ostomy/Bag_change_frequency/txt_Irrigation_solution'), 
//    '')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Urinary_Ostomy/Bag_change_frequency/txt_Amount_per_irrigation'), 
//    '12345')
//
//WebUI.delay(3)
//
//WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Urinary_Ostomy/Bag_change_frequency/txt_Irrigation_frequency'), 
//    'frequency')
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Foley_catheter_size/chb_14'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Catheter_lumens/chb_2_way'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Balloon_inflation/chb_10ml'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Drainage_Bag/chb_Leg_bag'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/txt_Change_frequency'), 
    'last change')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/txt_Date_last_changed'), 
    'October 10, 2019')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Irrigation_solution/chb_None'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Irrigation_solution/txt_None'), 
    'no one')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Irrigation_amount/chb_None'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Irrigation_amount/txt_None'), 
    'no one')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Irrigation_frequency/chb_Every'))

WebUI.delay(5)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/Indwelling_Urinary_Catheter/Irrigation_frequency/txt_Every'), 
    '3 days')

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Has_this_patient_been_treated_for_a_Urinary_Tract_Infection_in_the_past_14_days/chb_0 - No'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Has_this_patient_been_treated_for_a_Urinary_Tract_Infection_in_the_past_14_days/chb_1 - Yes'))

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Genitourinary_Status/Special_Procedure/txt_Other'), 'Special Procedure')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Has_this_patient_been_treated_for_a_Urinary_Tract_Infection_in_the_past_14_days/chb_NA - Patient on prophylactic treatment'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Has_this_patient_been_treated_for_a_Urinary_Tract_Infection_in_the_past_14_days/chb_UK - Unknown'))

not_run: WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Urinary_Incontinence_or_Urinary_Catheter_Presence/chb_0 - No_incontinence_or_catheter'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Urinary_Incontinence_or_Urinary_Catheter_Presence/chb_1 - Patient_is_incontinent'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Urinary_Incontinence_or_Urinary_Catheter_Presence/chb_2 - Patient_requires_a_urinary_catheter'))

not_run: WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Bowel_movement/chb_Normal_(Every 1_3 days)'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Bowel_movement/txt_Last_bowel_movement'), 'aeiou')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Bowel_movement/chb_Constipation'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Bowel_movement/chb_Chronic'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Bowel_movement/chb_Acute'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Bowel_movement/chb_Impaction'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Bowel_movement/chb_Incontinence'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Bowel_movement/chb_Diarrhea'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Bowel_movement/txt_times_a_day'), '2')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Bowel_movement/chb_Ostomy'))

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_Character/chb_Soft'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_Character/chb_Watery'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_Character/chb_Hard'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_Character/chb_Mucoid'))

not_run: WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_color/chb_Yellow_brown'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_color/chb_Grey'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_color/chb_Tarry'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_color/chb_Black'))

not_run: WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_color/txt_Other'), 'Red')

WebUI.delay(5)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_softener/chb_Effective'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_softener/chb_Not_effective'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_softener/chb_No_stool_softener'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Stool_softener/chb_MD_notified'))

WebUI.delay(4)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Laxative_Enema_use/chb_As_needed'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Lower_GI_Status/Laxative_Enema_use/chb_Daily'))

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Bowel_Incontinence_Frequency/chb_0 - Very_rarely_or_never_has_bowel_incontinence'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Bowel_Incontinence_Frequency/chb_1 - Less_than_once_weekly'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Bowel_Incontinence_Frequency/chb_2 - One_to_three_times_weekly'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Bowel_Incontinence_Frequency/chb_3 - Four_to_six_times_weekly'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Bowel_Incontinence_Frequency/chb_4 - On_a_daily_basis'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Bowel_Incontinence_Frequency/chb_5 - More_often_than_once_daily'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Bowel_Incontinence_Frequency/chb_NA - Patient_has_ostomy_for_bowel_elimination'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Bowel_Incontinence_Frequency/chb_UK - Unknown'))
//
//WebUI.delay(3)
WebUI.comment('')

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Ostomy_for_Bowel_Elimination/chb_0 - Patient_does_not_have_an_ostomy_for_bowel_elimination'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Ostomy_for_Bowel_Elimination/chb_1 - Patients_ostomy_was_not_related_to_an_inpatient_stay'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab10_Elimination/Ostomy_for_Bowel_Elimination/chb_2 - The_ostomy_was_related_to_an_inpatient_stay'))

not_run: WebUI.delay(5)

