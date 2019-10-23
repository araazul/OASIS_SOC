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

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/btn_Tab12_ADLs_IADLs'))

WebUI.delay(10)

WebUI.comment('Muscle Strenth')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Muscle_strength/chb_Strong'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Muscle_strength/chb_Fair'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Muscle_strength/chb_Weak'))

WebUI.delay(6)

WebUI.comment('Range of Motion')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Range_of_motion/chb_WFL'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Range_of_motion/chb_Limited'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Range_of_motion/chb_LUE'))

WebUI.delay(3)

//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Range_of_motion/chb_RUE'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Range_of_motion/chb_LLE'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Range_of_motion/chb_RLE'))
//
//WebUI.delay(6)
WebUI.comment('Bed Mobility')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Bed_mobility/chb_Independent'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Bed_mobility/chb_Moderate_assistance'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Bed_mobility/chb_Dependent'))
//
//WebUI.delay(6)
WebUI.comment('Transfer ability')

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Transfer_ability/chb_Independent'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Transfer_ability/chb_Moderate_assistance'))
//
//WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Transfer_ability/chb_Dependent'))

WebUI.delay(6)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Gait_Ambulation/chb_Steady'))

WebUI.delay(3)

//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Gait_Ambulation/chb_Unsteady'))
//
//WebUI.delay(3)
WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Balance/chb_Good'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Balance/chb_Fair'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Balance/chb_Poor'))
//
//WebUI.delay(6)
WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Risk_for_falls/chb_Low'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Risk_for_falls/chb_Moderate'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Risk_for_falls/chb_High'))
//
//WebUI.delay(6)
WebUI.comment('')

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Amputation/chb_BK'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Amputation/chb_AK'))
//
//WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Amputation/chb_UE'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Amputation/txt_UE'), 'UE')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Amputation/chb_Left'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Amputation/chb_Right'))
//
//WebUI.delay(3)
WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/chb_New'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Character/chb_Swelling'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Character/txt_Swelling'), 'Swelling')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Character/chb_Pallor'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Character/txt_Pallor'), 'Pallor')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Character/chb_Pain'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Character/txt_Pain'), 'Pain')

WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Skin_Temperature/chb_Warm'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Skin_Temperature/chb_Cold'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Mobility/chb_Able_to_move'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Mobility/txt_Able_to_move'), 
    'Able to move')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Mobility/chb_Unable_to_move'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Mobility/txt_Unable_to_move'), 
    'Unable to move')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Capillary_refill/chb_lessthan_3_sec'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/New/Capillary_refill/chb_greaterthat_3_sec'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/chb_Old'))

not_run: WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Musculoskeletal_Status/Fracture/txt_Location'), 'Piaz')

WebUI.delay(6)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/chb_Ambulation'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/chb_Endurance'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/chb_Contracture'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/chb_Paralysis'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/chb_Amputation'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/chb_Legally_blind'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/chb_Hearing'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/chb_Speech'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/chb_Dyspnea_with_minimal_Exertion'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/chb_Bowel_Bladder(Incontinence)'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Functional_Limitations/txt_Other'), 'Incontinence')

WebUI.delay(3)

WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Independent_at_home'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Up_as_tolerated'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Bedrest_with_BRP'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Complete_bedrest'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Transfer_bed_chair'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Partial_weight_bearing'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Walker'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Wheelchair'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Cane'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Crutches'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_No_restrictions'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/chb_Exercises_prescribed'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Activities_Permitted/txt_Other'), 'Others')

WebUI.delay(6)

WebUI.comment('')

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Grooming/chb_0'))
//
//WebUI.delay(3)
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Grooming/chb_1'))
//
//WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Grooming/chb_2'))

WebUI.delay(3)

//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Grooming/chb_3'))
//
//WebUI.delay(6)
WebUI.comment('')

//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Current_Ability_to_Dress_Upper_Body_safely/chb_0'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Current_Ability_to_Dress_Upper_Body_safely/chb_1'))
//
//WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Current_Ability_to_Dress_Upper_Body_safely/chb_2'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Current_Ability_to_Dress_Upper_Body_safely/chb_3'))

WebUI.delay(6)

WebUI.comment('')

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Current_Ability_to_Dress_Lower_Body_safely/chb_0'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Current_Ability_to_Dress_Lower_Body_safely/chb_1'))
//
//WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Current_Ability_to_Dress_Lower_Body_safely/chb_2'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Current_Ability_to_Dress_Lower_Body_safely/chb_3'))
//
//WebUI.delay(5)
WebUI.comment('')

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Bathing/chb_0'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Bathing/chb_1'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Bathing/chb_2'))
//
//WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Bathing/chb_3'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Bathing/chb_4'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Bathing/chb_5'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Bathing/chb_6'))
//
//WebUI.delay(6)
WebUI.comment('')

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Toilet_Transferring/chb_0'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Toilet_Transferring/chb_1'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Toilet_Transferring/chb_2'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Toilet_Transferring/chb_3'))
//
//WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Toilet_Transferring/chb_4'))

WebUI.delay(6)

WebUI.comment('Toileting/Hygiene')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Toileting_Hygiene/chb_0'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Toileting_Hygiene/chb_1'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Toileting_Hygiene/chb_2'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Toileting_Hygiene/chb_3'))
//
//WebUI.delay(6)
WebUI.comment('')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Transferring/chb_0'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Transferring/chb_1'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Transferring/chb_2'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Transferring/chb_3'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Transferring/chb_4'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Transferring/chb_5'))
//
//WebUI.delay(6)
WebUI.comment('Ambulation/Locomotion')

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Ambulation_Locomotion/chb_0'))
//
//WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Ambulation_Locomotion/chb_1'))

WebUI.delay(3)

//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Ambulation_Locomotion/chb_2'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Ambulation_Locomotion/chb_3'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Ambulation_Locomotion/chb_4'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Ambulation_Locomotion/chb_5'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Ambulation_Locomotion/chb_6'))
//
//WebUI.delay(3)
WebUI.comment('Feeding or Eating')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Feeding_or_Eating/chb_0'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Feeding_or_Eating/chb_1'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Feeding_or_Eating/chb_2'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Feeding_or_Eating/chb_3'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Feeding_or_Eating/chb_4'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Feeding_or_Eating/chb_5'))
//
//WebUI.delay(5)
WebUI.comment('Has this patient')

//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Has_this_patient_had_a_multi-factor_Falls_Risk_Assessment_using_a_standardized,_validated_assessment_tool/chb_0 - No'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Has_this_patient_had_a_multi-factor_Falls_Risk_Assessment_using_a_standardized,_validated_assessment_tool/1 - Yes, and it does not indicate a risk for falls'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Has_this_patient_had_a_multi-factor_Falls_Risk_Assessment_using_a_standardized,_validated_assessment_tool/2 - Yes, and it does indicate a risk for falls'))

WebUI.delay(3)

WebUI.comment('MAHC')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/MAHC - 10 - Fall_Risk_Assessment_Tool/chb_Age 65'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/MAHC - 10 - Fall_Risk_Assessment_Tool/chb_Diagnosis_(3 or more co-existing)'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/MAHC - 10 - Fall_Risk_Assessment_Tool/chb_Prior_history_of_falls_within_3_months'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/MAHC - 10 - Fall_Risk_Assessment_Tool/chb_Incontinence'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/MAHC - 10 - Fall_Risk_Assessment_Tool/chb_Visual_impairment'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/MAHC - 10 - Fall_Risk_Assessment_Tool/chb_Impaired_functional_mobility'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/MAHC - 10 - Fall_Risk_Assessment_Tool/chb_Environment_hazards'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/MAHC - 10 - Fall_Risk_Assessment_Tool/chb_Poly_Pharmacy_(4 or more prescriptions - any type)'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/MAHC - 10 - Fall_Risk_Assessment_Tool/chb_Pain_affecting_level_of_function'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/MAHC - 10 - Fall_Risk_Assessment_Tool/chb_Cognitive_impairment'))
//
//WebUI.delay(3)
WebUI.comment('Section GG')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Section_GG_Functional_Abilities_and_Goals/drd_A. Self Care'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Section_GG_Functional_Abilities_and_Goals/drd_B. Indoor Mobility (Ambulation)'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Section_GG_Functional_Abilities_and_Goals/drd_C. Stairs'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Section_GG_Functional_Abilities_and_Goals/drd_D. Functional_Cognition'))

WebUI.delay(5)

WebUI.comment('Prior Device Use')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Prior_Device_Use/chb_A. Manual_wheelchair'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Prior_Device_Use/chb_B. Motorized_wheelchair_and_or_scooter'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Prior_Device_Use/chb_C. Mechanical_lift'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Prior_Device_Use/chb_D. Walker'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Prior_Device_Use/chb_E. Orthotics_Prosthetics'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Prior_Device_Use/chb_Z. None_of_the_above'))
//
//WebUI.delay(5)
WebUI.comment('Mobility')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/A. Roll left and right/drd_SOC_ROC_Performance'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/A. Roll left and right/drd_Discharge_Goal'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/B. Oral Hygiene/drd_SOC_ROC_Performance'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/B. Oral Hygiene/drd_Discharge_Goal'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/C. Toileting Hygiene/drd_SOC_ROC_Performance'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/C. Toileting Hygiene/drd_Discharge_Goal'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/E. Shower_bathe self/drd_SOC_ROC_Performance'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/E. Shower_bathe self/drd_Discharge_Goal'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/F. Upper body dressing/drd_SOC_ROC_Performance'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/F. Upper body dressing/drd_Discharge_Goal'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/G. Lower body dressing/drd_SOC_ROC_Performance'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/G. Lower body dressing/drd_Discharge_Goal'))

WebUI.delay(5)

WebUI.comment('G')

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/G. Lower body dressing/drd_SOC_ROC_Performance'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/G. Lower body dressing/drd_Discharge_Goal'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/I. Walk 10 feet/drd_SOC_ROC_Peerformance'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/I. Walk 10 feet/drd_Discharge_Goal'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/N. 4_Steps/drd_SOC_ROC_Performance'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/N. 4_Steps/drd_Discharge_Goal'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/O. 12_steps/drd_SOC_ROC_Performance'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab12_ADLs_IADLs/Mobility/O. 12_steps/drd_Discharge_Goal'))

WebUI.delay(5)

