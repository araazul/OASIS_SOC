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

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/btn_Tab11_Neurological'))

WebUI.delay(7)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Pupils/chb_PERRLA'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Non-reactive/chb_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Non-reactive/chb_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Size_unequal/chb_Left_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Size_unequal/chb_Left__Right'))

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Oriented'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Time'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Place'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Person'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Purpose'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Disoriented'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Forgetful'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Depressed'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Agitated'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Lethargic'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/chb_Comatose'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Mental_status/txt_Other'), 'Others')

WebUI.delay(3)

WebUI.comment('Sleep/Rest')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Sleep_Rest/chb_Adequate'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Sleep_Rest/chb_Inadequate'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Sleep_Rest/txt_Inadequate'), '')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Sleep_Rest/chb_MD_notified'))

WebUI.delay(3)

WebUI.comment('Hand grips')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Hand_grips/chb_Strong'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Hand_grips/chb_Strong_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Hand_grips/chb_Strong_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Hand_grips/chb_Weak'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Hand_grips/chb_Weak_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Hand_grips/chb_Weak_Right'))

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/chb_Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Weakness/chb_Upper_extremity'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Weakness/chb_Upper_extremity_Left_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Weakness/chb_Upper_extremity_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Weakness/chb_Lower_extremity'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Weakness/chb_Lower_extremity_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Weakness/chb_Lower_extremity_Right'))

WebUI.delay(3)

WebUI.comment('Paralysis')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Paralysis/chb_Hemiparesis'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Paralysis/chb_Hemiparesis_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Paralysis/chb_Hemiparesis_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Paralysis/chb_Hemiplegia'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Paralysis/chb_Hemiplegia_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Paralysis/chb_Hemiplegia_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Paralysis/chb_Paraplegia'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Paralysis/chb_Quadriplegia'))

WebUI.delay(3)

WebUI.comment('Seizure')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Seizure/chb_Gran_Mal'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Seizure/txt_Gran_Mal_Last seizure date'), 
    'gran')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Seizure/chb_Petit_Mal'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Seizure/txt_Petit Mal_Last seizure date'), 
    'petit')

WebUI.delay(5)

WebUI.comment('Tremors')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Tremors/Upper_extremity/chb_Upper_extremity'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Tremors/Upper_extremity/chb_Upper_extremity_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Tremors/Upper_extremity/chb_Upper_extremity_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Tremors/Upper_extremity/chb_Upper_extremity_Fine'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Tremors/Upper_extremity/chb_Upper_extremity_Coarse'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Tremors/Lower_extremity/chb_Lower_extremity'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Tremors/Lower_extremity/chb_Lower_extremity_Left'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Tremors/Lower_extremity/chb_Lower_extremity_Right'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Tremors/Lower_extremity/chb_Lower_extremity_Fine'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Tremors/Lower_extremity/chb_Lower_extremity_Coarse'))

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/chb_Headache'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/chb_Numbness_Tingling'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/chb_Loss_of_sensation'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/chb_Visual_disturbance'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/chb_Incoordination'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/chb_Involuntary_motor_function'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/chb_Improper_response_to_stimuli'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/chb_Loss_of_ability_to_move_a_body_part'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/txt_Loss_of_ability_to_move_a_body_part'), 
    'Move it')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/chb_Other'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Neurological_Status/Check_for_weakness,_paralysis,_seizures,_tremors_and_other_signs/Other_signs/txt_Other'), 
    'Others')

WebUI.delay(5)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/chb_Cognitive_impairment'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/chb_Confused'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/chb_Anxious'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/chb_Depressed'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/chb_Memory_deficit'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/chb_Impaired_decision-making'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/chb_Physical_aggression'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/chb_Inappropriate_behavior'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/chb_Disruptive_behavior'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/chb_Delusional,_hallucinatory,_paranoid'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/txt_Other'), 'Others')

WebUI.delay(3)

WebUI.comment('Language barrier')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Language barrier/chb_No'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Language barrier/chb_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Language barrier/chb_Interpreter_needed'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Language barrier/txt_Interpreter_needed'), 
    '')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Language barrier/chb_Interpreter_service_provider'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Language barrier/txt_Interpreter_service_provider'), 
    'Interpreter')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Language barrier/txt_Phone'), '09064876533')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Language barrier/chb_Sign_language(Type)'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Language barrier/txt_Sign_language(Type)'), 
    'Sign Language')

WebUI.delay(3)

WebUI.comment('Learning_barrier')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/chb_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/Functional/chb_Functional'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/Functional/txt_Specify'), 
    '')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/Mental_Cognitive/chb_Mental_Cognitive'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/Mental_Cognitive/txt_Specify'), 
    '')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/Physical/chb_Physical'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/Physical/txt_Specify'), 
    '')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/Psychosocial/chb_Psychosocial'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/Psychosocial/txt_Specify'), 
    '')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/chb_Unable_to_read'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Learning barrier/chb_Unable_to_write'))

WebUI.delay(3)

WebUI.comment('Signs of abuse')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Signs_of_abuse_neglect_exploitation/chb_Potential'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Signs_of_abuse_neglect_exploitation/chb_Actual'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Signs_of_abuse_neglect_exploitation/chb_Physical'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Signs_of_abuse_neglect_exploitation/txt_Describe'), 
    '')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Signs_of_abuse_neglect_exploitation/chb_Verbal_Emotional'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Signs_of_abuse_neglect_exploitation/txt_Describe2'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Signs_of_abuse_neglect_exploitation/chb_Referred_to_MSW'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Signs_of_abuse_neglect_exploitation/txt_Referred_to_MSW'), 
    '')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Signs_of_abuse_neglect_exploitation/chb_Referred_to_Child_Adult_Protective_Services'))

WebUI.delay(3)

WebUI.comment('Spiritual')

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Spiritual_cultural_considerations/txt_Implications_that_may_impact_care'), 
    'Implications')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Spiritual_cultural_considerations/txt_Spiritual_resource'), 
    'Spiritual Resource')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Spiritual_cultural_considerations/txt_Contact'), 
    'Ara')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab11_Neurological/Psychosocial_Status/Spiritual_cultural_considerations/txt_Phone'), 
    '09095678145')

WebUI.delay(3)

WebUI.comment('Cognitive Funtioning')

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive_Functioning/chb_0'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive_Functioning/chb_1'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive_Functioning/chb_2'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive_Functioning/chb_3'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive_Functioning/chb_4'))

not_run: WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/When_Confused_(Reported or Observed Within the Last 14 Days)/chb_0 - Never'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/When_Confused_(Reported or Observed Within the Last 14 Days)/chb_1 - In_new_or_complex_situations_only'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/When_Confused_(Reported or Observed Within the Last 14 Days)/chb_2 - On_awakening_or_at_night_only'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/When_Confused_(Reported or Observed Within the Last 14 Days)/chb_3 - During_the_day_and_evening,_but_not_constantly'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/When_Confused_(Reported or Observed Within the Last 14 Days)/chb_4 - Constantly'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/When_Confused_(Reported or Observed Within the Last 14 Days)/chb_NA - Patient_nonresponsive'))

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/chb_0 - No'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/chb_1 - Yes,_patient_was_screened'))

WebUI.delay(3)

WebUI.comment('PHQ')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/PHQ-2/a) Little interest or pleasure in doing things/chb_0'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/PHQ-2/a) Little interest or pleasure in doing things/chb_1'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/PHQ-2/a) Little interest or pleasure in doing things/chb_2'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/PHQ-2/a) Little interest or pleasure in doing things/chb_3'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/PHQ-2/a) Little interest or pleasure in doing things/chb_NA'))

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/PHQ-2/b) Feeling down, depressed, or hopeless/chb_0'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/PHQ-2/b) Feeling down, depressed, or hopeless/chb_1'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/PHQ-2/b) Feeling down, depressed, or hopeless/chb_2'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/PHQ-2/b) Feeling down, depressed, or hopeless/chb_3'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/PHQ-2/b) Feeling down, depressed, or hopeless/chb_NA'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/chb_2 - Yes,_patient_was_screened_with_a_different_standardized'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Depression_Screening/chb_3 - Yes,_patient_was_screened_with_a_different_standardized,'))

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive,_behavioral,_and_psychiatric_symptoms/chb_1 - Memory_deficit'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive,_behavioral,_and_psychiatric_symptoms/chb_2 - Impaired_decision-making'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive,_behavioral,_and_psychiatric_symptoms/chb_3 - Verbal_disruption'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive,_behavioral,_and_psychiatric_symptoms/chb_4 - Physical_aggression'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive,_behavioral,_and_psychiatric_symptoms/chb_5 - Disruptive,_infantile'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive,_behavioral,_and_psychiatric_symptoms/chb_6 - Delusional,_hallucinatory'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Cognitive,_behavioral,_and_psychiatric_symptoms/chb_7 - None_of_the_above'))

WebUI.delay(5)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Frequency_of_Disruptive_Behavior_Symptoms_(Reported or Observed)/chb_0 - Never'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Frequency_of_Disruptive_Behavior_Symptoms_(Reported or Observed)/chb_1 - Less_than_once_a_month'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Frequency_of_Disruptive_Behavior_Symptoms_(Reported or Observed)/chb_2 - Once_a_month'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Frequency_of_Disruptive_Behavior_Symptoms_(Reported or Observed)/chb_3 - Several_times_each_month'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Frequency_of_Disruptive_Behavior_Symptoms_(Reported or Observed)/chb_4 - Several_times_a_week'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab11_Neurological/Frequency_of_Disruptive_Behavior_Symptoms_(Reported or Observed)/chb_5 - At_least_daily'))

WebUI.delay(5)

