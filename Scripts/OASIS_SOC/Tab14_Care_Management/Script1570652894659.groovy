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

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/btn_Tab14_Care_Management'))

WebUI.delay(10)

//
//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Types_and_Sources_of_Assistance/chb_0'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Types_and_Sources_of_Assistance/chb_1'))
//
//WebUI.delay(2)
WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Types_and_Sources_of_Assistance/chb_3'))

WebUI.delay(2)

//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Types_and_Sources_of_Assistance/chb_3'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Types_and_Sources_of_Assistance/chb_4'))
//
//WebUI.delay(2)
WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Therapy_Need/Therapy_Need'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Therapy_Need/txt_Number_of_therapy_visits'))

WebUI.delay(5)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Therapy_Need/txt_Number_of_therapy_visits'), '000')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Therapy_Need/chb_NA'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Physical_Therapy/chb_Difficulty_in_transfers'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Physical_Therapy/chb_PCG_having_difficulty_managing_bed_patient'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Physical_Therapy/chb_Difficulty_in_lower_extremity_brace'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Physical_Therapy/chb_Knowledge_deficit_with_assistive_device_mobility'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Physical_Therapy/chb_Identified_high_risk_for_fall'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Physical_Therapy/chb_Pain_of_muscle_or_joint_origin'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Physical_Therapy/chb_Therapeutic_exercise'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Physical_Therapy/chb_Newly_developed_contractures'))

WebUI.delay(5)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Physical_Therapy/txt_Other'), 
    'Difficulty ')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Occupational_Therapy/chb_Upper_extremity_weakness_deficit_in_use'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Occupational_Therapy/chb_Requires_splinting_adaptive_equipment'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Occupational_Therapy/chb_Difficulty_in_ADLs'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Occupational_Therapy/chb_Limited_upper_extremity_ROM'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Occupational_Therapy/chb_Requires_work_simplification_for_ADLs'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Occupational_Therapy/chb_Need_instructions_in_energy_conservation_for_ADLs'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Occupational_Therapy/chb_Difficulty_problem_solving_other_cognitive'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Occupational_Therapy/chb_Decreased_coordination_fine_motor_control'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Occupational_Therapy/txt_Other'), 
    'Physical Therapchy')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Speech_Therapy/chb_Receptive_expressive_aphasia'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Speech_Therapy/chb_Communication_deficits'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Speech_Therapy/chb_Other_cognitive_deficit'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Speech_Therapy/chb_Short_attention_span,_memory_disturbance'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Speech_Therapy/chb_Short_attention_span,_memory_disturbance'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Speech_Therapy/chb_Poor_gag_reflex,_swallowing_difficulty,_drooling'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Speech_Therapy/chb_Facial_tongue_mobility_deficits'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Speech_Therapy/txt_Other'), 
    'Speech Theraphy')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/chb_Referral_to_SSA,_SSI,_Medi-Cal'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/chb_Meals,_housing,_transportation'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/chb_Assistance_with_ADLs'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/chb_Evaluation_and_education'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/chb_Act_as_patient_advocate_Advance_directives'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/chb_Assistance_with_reimbursement_procedure'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/chb_Need_for_community_services'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/txt_Need_for_community_services'), 
    'Community service')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/chb_Counseling'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/txt_Counseling'), 
    'counseling')

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/MSW/txt_Other'), 
    '')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Dietician/chb_Identified_high_risk_from_nutritional_screening_initiative'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/Dietician/txt_Other'), 
    '')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/CHHA/chb_To_assist_personal_care'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Physician_Orders_for_Ancillary_Referrals/CHHA/txt_Other'), 
    '')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Coordination_of_Care_with/chb_Physician'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Coordination_of_Care_with/chb_RN_Supervisor'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Coordination_of_Care_with/chb_RN_LVN'))
//
//WebUI.delay(3)
//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Coordination_of_Care_with/chb_Patient'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Coordination_of_Care_with/chb_PCG'))
//
//WebUI.delay(3)
WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Coordination_of_Care_with/txt_Other'), 'SNV/LVN')

WebUI.delay(5)

//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Communicated_via/chb_Phone'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Communicated_via/chb_Fax'))
//
//WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Communicated_via/chb_Person_To_Person'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Communicated_via/txt_Communication_received_by'), 
    'Joseph R. Nuezca')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Communicated_via/txt_Date'), 'December 10, 2019')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Care_Coordination/Communicated_via/txt_Time'), '10:00 pm')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Patient_Condition/chb_S_S_indicative_of_heart_failure'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Patient_Condition/chb_Diabetic_reactions'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Patient_Condition/chb_Hypertensive_crisis'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Patient_Condition/chb_Depression'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Patient_Condition/chb_New_Wound'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Patient_Condition/chb_Unrelieved_pain'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Patient_Condition/chb_Fall_injury'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Patient_Condition/txt_Other'), 'Diabetic')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Adverse_effect'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Potential_adverse_effect'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Ineffective_drug_therapy'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Significant_side_effect'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Significant_drug_interactions'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Noncompliance'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Missed_dose'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_New_medication'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Medication_reconciliation'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Duplicate_drug_therapy'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Missing_medication'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/chb_Wrong_dose'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Regarding_Medication/txt_Other'), '')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_Laboratory'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_Medication'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_Treatments'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_DME'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_Diabetic_foot_care'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_Fall_prevention_interventions'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_Depression_interventions'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_Interventions_to_monitor_and_mitigate_pain'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_Interventions_to_prevent_pressure_ulcer'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_Wound_care_treatment'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/chb_Patient_specific_parameters_for_notifying_MD'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Subject_Areas/Obtained_Physician_Orders_for/txt_Other'), 'Patient')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/chb_No_DME_needed'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Walker/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Walker/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Cane/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Cane/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Wheelchair/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Wheelchair/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Bedside_commode/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Bedside_commode/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Shower_bench/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Shower_bench/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Feeding_pump/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Feeding_pump/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Suction_machine/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Suction_machine/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/O2_concentrator/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/O2_concentrator/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Nebulizer_machine/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Nebulizer_machine/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Hospital_bed/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Hospital_bed/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Low_air_loss_mattress/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Low_air_loss_mattress/chb_Needs'))

WebUI.delay(5)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Other/txt_Other'), 'Has')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Other/chb_Has'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/Other/chb_Needs'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/DME_working_properly/chb_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/DME_working_properly/chb_No'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/DME_working_properly/txt_No'), 'its a no')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/DME/DME_working_properly/chb_Malfunction_reported_to_DME_vendor'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Disease_process,_risk_factors_and_management'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Prevention_of_complications_and_exacerbation'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Reportable_signs_and_symptoms'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Emergency_measures'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Medication_effects_adverse_reactions_compliance'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Compliance_with_procedures_treatment_therapy'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Diet_and_nutrition'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Home_safety_fall_prevention'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Oxygen_safety_and_fire_prevention'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Infection_control'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/chb_Pain_management'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Knowledge_Deficit_Assessed/txt_Other'), 'Other text')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Additional_Assessments/txt_Additional_Assessment'), '')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Patient_rights_and_responsibilities'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_State_hotline_number'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Advance_directives'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Do_Not_Resuscitate_(DNR)'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_HIPAA_Notice_of_Privacy_Practices'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_OASIS_Privacy_Notice'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Agency_phone_number_after_hours_number'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_When_to_contact_physician_and_or_agency'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Advance_Beneficiary_Notice_(ABN_and_HHCCN)'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Emergency_planning_if_service_is_disrupted'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Infection_control,_standard_precatutions_handwashing'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Basic_home_safety'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Fall_prevention_guide'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Medication_profile_and_reconciliation'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Advance_Beneficiary_Notice'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Oxygen_risk_assessment_and_intervention'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/chb_Disease_process,_risk_factors,_reportable_S_S'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/txt_Other'), 
    '')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/txt__Other'), 
    '')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Instructions,_Teaching_Materials_and_Handouts_Provided_to_Patient_Caregiver/txt___Other'), 
    '')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_Return_to_an_independent_level_of_care_(self-care)'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_Able_to_remain_in_residence'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_Able_to_remain_in_assistive_facility'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_When_patient_caregiver_knowledgeable'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_Able_to_understand_medication_regime,'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_Medical_condition_stabilizes'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_When_maximum_potential_is_reached'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_Discharge_at_the_end_of_the_episode'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_When_goals_are_met'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/txt_Other'), 'Discharge Plans')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_patient'))

WebUI.delay(3)

//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_PCG'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_family_and_they_are'))
//
//WebUI.delay(3)
//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_agreeable'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_not_agreeable'))
//
//WebUI.delay(3)
WebUI.setText(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/txt_Patients_Goals'), 'My patient goal is to become healthy.')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_Discipline_frequency'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab14_Care_Management/Discharge_Plans/chb_Good'))

WebUI.delay(3)

