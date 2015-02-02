package info.chenli.druglit;

import java.util.ArrayList;
import java.util.TreeMap;

public class SideEffectOntology {

	private static TreeMap<String, TreeMap<String, ArrayList<String>>> sideEffectOntology = new TreeMap<String, TreeMap<String, ArrayList<String>>>();

	static {
		
		/**
		 * CNS
		 */
		TreeMap<String, ArrayList<String>> cnsSideEffectOntology = new TreeMap<String, ArrayList<String>>();

		cnsSideEffectOntology.put("Seizures", new ArrayList<String>());
		ArrayList<String> sideEffects = cnsSideEffectOntology.get("Seizures");
		sideEffects.add("CONVULSION");
		sideEffects.add("PARTIAL SEIZURES");
		sideEffects.add("SIMPLE PARTIAL SEIZURES");
		sideEffects.add("COMPLEX PARTIAL SEIZURES");
		sideEffects.add("TONIC CONVULSION");
		sideEffects.add("GRAND MAL CONVULSION");
		sideEffects.add("POST-TRAUMATIC EPILEPSY");
		sideEffects.add("EPILEPSY");
		sideEffects.add("PETIT MAL EPILEPSY");
		sideEffects.add("STATUS EPILEPTICUS");
		sideEffects.add("TEMPORAL LOBE EPILEPSY");

		cnsSideEffectOntology.put("Cognitive Disorders", new ArrayList<String>());
		sideEffects = cnsSideEffectOntology.get("Cognitive Disorders");
		sideEffects.add("COGNITIVE DISORDER");
		sideEffects.add("CONFUSIONAL STATE");
		sideEffects.add("MENTAL STATUS CHANGES");
		sideEffects.add("MEMORY IMPAIRMENT");
		sideEffects.add("AMNESIA");
		sideEffects.add("TRANSIENT GLOBAL AMNESIA");
		sideEffects.add("AMNESTIC DISORDER");
		sideEffects.add("ANTEROGRADE AMNESIA");
		sideEffects.add("RETROGRADE AMNESIA");
		sideEffects.add("GLOBAL AMNESIA");
		sideEffects.add("POST-TRAUMATIC AMNESTIC DISORDER");
		sideEffects.add("FEELING DRUNK");
		sideEffects.add("DISORIENTATION");
		sideEffects.add("DEMENTIA");
		sideEffects.add("ENCEPHALOPATHY");
		sideEffects.add("VASCULAR ENCEPHALOPATHY");
		sideEffects.add("URAEMIC ENCEPHALOPATHY");
		sideEffects.add("HYPOXIC ENCEPHALOPATHY");
		sideEffects.add("ANOXIC ENCEPHALOPATHY");
		sideEffects.add("HYPOXIC-ISCHAEMIC ENCEPHALOPATHY");
		sideEffects.add("TOXIC ENCEPHALOPATHY");
		sideEffects.add("TOXIC INDUCED ENCEPHALOPATHY");
		sideEffects.add("METABOLIC ENCEPHALOPATHY");
		sideEffects.add("HYPONATRAEMIC ENCEPHALOPATHY");
		sideEffects.add("LEUKOENCEPHALOPATHY");
		sideEffects.add("POSTERIOR REVERSIBLE ENCEPHALOPATHY SYNDROME");
		sideEffects.add("REVERSIBLE POSTERIOR LEUKOENCEPHALOPATHY SYNDROME");
		sideEffects.add("ENCEPHALITIS");

		cnsSideEffectOntology.put("Sedation", new ArrayList<String>());
		sideEffects = cnsSideEffectOntology.get("Sedation");
		sideEffects.add("SEDATION");
		sideEffects.add("SOMNOLENCE");
		sideEffects.add("HYPERSOMNIA");
		sideEffects.add("IMPAIRED DRIVING ABILITY");
		sideEffects.add("ROAD TRAFFIC ACCIDENT");

		cnsSideEffectOntology.put("Emotional Disorder", new ArrayList<String>());
		sideEffects = cnsSideEffectOntology.get("Emotional Disorder");
		sideEffects.add("EMOTIONAL DISORDER");
		sideEffects.add("EMOTIONAL DISTRESS");
		sideEffects.add("ANXIETY");
		sideEffects.add("FEELING ABNORMAL");
		sideEffects.add("AGITATION");
		sideEffects.add("IRRITABILITY");
		sideEffects.add("NERVOUSNESS");
		sideEffects.add("STRESS");
		sideEffects.add("CRYING");
		sideEffects.add("FEELING JITTERY");
		sideEffects.add("FEELING GUILTY");
		sideEffects.add("PSYCHOLOGICAL TRAUMA");

		cnsSideEffectOntology.put("Behavior Disorder", new ArrayList<String>());
		sideEffects = cnsSideEffectOntology.get("Behavior Disorder");
		sideEffects.add("ABNORMAL BEHAVIOUR");
		sideEffects.add("AGGRESSION");
		sideEffects.add("ANGER");
		sideEffects.add("PERSONALITY CHANGE");

		cnsSideEffectOntology
				.put("Psychosis, Paranoia, Mania, Anxiety Disorder, and Bipolar Disorders",
						new ArrayList<String>());
		sideEffects = cnsSideEffectOntology
				.get("Psychosis, Paranoia, Mania, Anxiety Disorder, and Bipolar Disorders");
		sideEffects.add("PSYCHOTIC DISORDER");
		sideEffects.add("SUBSTANCE-INDUCED PSYCHOTIC DISORDER");
		sideEffects.add("ACUTE PSYCHOSIS");
		sideEffects.add("PSYCHOTIC BEHAVIOUR");
		sideEffects.add("SCHIZOPHRENIA");
		sideEffects.add("SCHIZOAFFECTIVE DISORDER");
		sideEffects.add("SCHIZOID PERSONALITY DISORDER");
		sideEffects.add("HALLUCINATION");
		sideEffects.add("DISSOCIATIVE DISORDER");
		sideEffects.add("DELIRIUM");
		sideEffects.add("PARANOIA");
		sideEffects.add("PARANOID PERSONALITY DISORDER");
		sideEffects.add("PARANOID TYPE");
		sideEffects.add("MANIA");
		sideEffects.add("HYPOMANIA");
		sideEffects.add("BIPOLAR DISORDER");
		sideEffects.add("BIPOLAR II DISORDER");
		sideEffects.add("BIPOLAR I DISORDER");
		sideEffects.add("ANXIETY DISORDER");
		sideEffects.add("GENERALISED ANXIETY DISORDER");
		sideEffects.add("FEAR");
		sideEffects.add("SOCIAL FEAR");
		sideEffects.add("SOCIAL PHOBIA");
		sideEffects.add("FEAR OF DEATH");
		sideEffects.add("PHONOPHOBIA");
		sideEffects.add("CLAUSTROPHOBIA");
		sideEffects.add("AGORAPHOBIA");
		sideEffects.add("AUTOPHOBIA");
		sideEffects.add("HYDROPHOBIA");
		sideEffects.add("PANIC DISORDER");
		sideEffects.add("PANIC ATTACK");
		sideEffects.add("PANIC DISORDER WITH AGORAPHOBIA");
		sideEffects.add("PANIC REACTION");

		cnsSideEffectOntology.put("Depression, Mood Disorder, Suicidality",
				new ArrayList<String>());
		sideEffects = cnsSideEffectOntology
				.get("Depression, Mood Disorder, Suicidality");
		sideEffects.add("DEPRESSIVE SYMPTOM");
		sideEffects.add("FEELING OF DESPAIR");
		sideEffects.add("DYSTHYMIC DISORDER");
		sideEffects.add("ANHEDONIA");
		sideEffects.add("DEPRESSED MOOD");
		sideEffects.add("FEELINGS OF WORTHLESSNESS");
		sideEffects.add("DEPRESSION");
		sideEffects.add("DEPRESSION SUICIDAL");
		sideEffects.add("DEPRESSION POSTOPERATIVE");
		sideEffects.add("MAJOR DEPRESSION");
		sideEffects.add("AGITATED DEPRESSION");
		sideEffects.add("DEPRESSIVE DELUSION");
		sideEffects.add("SUICIDAL IDEATION");
		sideEffects.add("SUICIDAL BEHAVIOUR");
		sideEffects.add("SUICIDE ATTEMPT");
		sideEffects.add("COMPLETED SUICIDE");
		sideEffects.add("MOOD ALTERED");
		sideEffects.add("AFFECTIVE DISORDER");
		sideEffects.add("MOOD DISORDER DUE TO A GENERAL MEDICAL CONDITION");
		sideEffects.add("ELEVATED MOOD");
		sideEffects.add("EUPHORIC MOOD");
		sideEffects.add("MOOD SWINGS");

		sideEffectOntology.put("cns", cnsSideEffectOntology);

		/**
		 * Sudden death
		 */
		1. Death/Sudden Death
		DEATH: 966		
			SUDDEN DEATH: 99	
			MATERNAL DEATH AFFECTING FOETUS: 1	
			ACCIDENTAL DEATH: 3	
			APPARENT DEATH: 9	
			CARDIAC DEATH: 16	
			SUDDEN CARDIAC DEATH: 37
			RESUSCITATION: 18
		CARDIAC ARREST: 510				
			CARDIO-RESPIRATORY ARREST: 223	
		CARDIOGENIC SHOCK: 90				
			CIRCULATORY COLLAPSE: 124		
		2. Risk Factors for Death/Sudden Death: Arrhythmia and Heart Block
		a. Arrhythmia and Heart Block
		ARRHYTHMIA: 294								
			HEART RATE ABNORMAL: 18							
			SINUS BRADYCARDIA: 102						
			HEART RATE IRREGULAR: 190						
			CARDIAC FIBRILLATION: 7					
			ATRIAL FIBRILLATION: 864				
			BRADYCARDIA: 353						
			HEART RATE DECREASED: 207					
			BRADYARRHYTHMIA: 16					
			TACHYCARDIA: 340						
			HEART RATE INCREASED: 443					
			TACHYARRHYTHMIA: 28					
			TACHYCARDIA PAROXYSMAL: 2				
			ATRIAL TACHYCARDIA: 35				
			POSTURAL ORTHOSTATIC TACHYCARDIA SYNDROME: 1				
			VENTRICULAR ARRHYTHMIA: 23							
			VENTRICULAR TACHYCARDIA: 172						
			VENTRICULAR TACHYARRHYTHMIA: 2					
			VENTRICULAR FLUTTER: 4				
			VENTRICULAR FIBRILLATION: 138						
			VENTRICULAR EXTRASYSTOLES: 131						
			AGONAL RHYTHM: 1						
			ARRHYTHMIA SUPRAVENTRICULAR: 15							
			SUPRAVENTRICULAR TACHYCARDIA: 85					
			ATRIAL FLUTTER: 101				
			SINUS ARRHYTHMIA: 11					
			SICK SINUS SYNDROME: 47			
			SINUS TACHYCARDIA: 189			
			NODAL RHYTHM: 6							
			NODAL ARRHYTHMIA: 20						
			RHYTHM IDIOVENTRICULAR: 1						
			ACCELERATED IDIOVENTRICULAR RHYTHM: 1					
			CARDIAC FLUTTER: 33							
			CARDIAC ABLATION: 4							
			REPERFUSION ARRHYTHMIA: 4							
			SINOATRIAL BLOCK: 1							
			ATRIOVENTRICULAR BLOCK: 76							
			ATRIOVENTRICULAR BLOCK FIRST DEGREE: 58						
			ATRIOVENTRICULAR BLOCK SECOND DEGREE: 34					
			ATRIOVENTRICULAR BLOCK THIRD DEGREE: 4						
			ATRIOVENTRICULAR BLOCK COMPLETE: 86						
			BUNDLE BRANCH BLOCK: 31							
			BUNDLE BRANCH BLOCK RIGHT: 60						
			BUNDLE BRANCH BLOCK BILATERAL: 1						
			BUNDLE BRANCH BLOCK LEFT: 76						
				BIFASCICULAR BLOCK: 1						
			CARDIAC PACEMAKER INSERTION: 85							
				CARDIAC PACEMAKER REPLACEMENT: 10						
				CARDIAC PACEMAKER MALFUNCTION: 2						
				IMPLANTABLE DEFIBRILLATOR INSERTION: 27						
				IMPLANTABLE DEFIBRILLATOR MALFUNCTION: 4					
		IMPLANTABLE DEFIBRILLATOR REPLACEMENT: 1						
		b. Risk Factor for Death/Sudden Death: Hypotension
		BLOOD PRESSURE DECREASED: 450					
			BLOOD PRESSURE SYSTOLIC DECREASED: 52				
			BLOOD PRESSURE DIASTOLIC DECREASED: 81				
			HYPOTENSION: 1081				
			ORTHOSTATIC HYPOTENSION: 141			
				BLOOD PRESSURE ORTHOSTATIC: 4		
				ORTHOSTATIC INTOLERANCE: 2		
				BLOOD PRESSURE ORTHOSTATIC ABNORMAL: 2		
				BLOOD PRESSURE ORTHOSTATIC DECREASED: 7		
				SYNCOPE VASOVAGAL: 16		
		BLOOD PRESSURE FLUCTUATION: 81					
		BLOOD PRESSURE IMMEASURABLE: 16
		DEHYDRATION: 1040	
		c. Risk Factor for Death/Sudden Death: EKG Changes
		ELECTROCARDIOGRAM ABNORMAL: 83							
		EXERCISE ELECTROCARDIOGRAM ABNORMAL: 1						
			ELECTROCARDIOGRAM CHANGE: 8						
			ELECTROCARDIOGRAM ST SEGMENT ABNORMAL: 12					
			ELECTROCARDIOGRAM Q WAVE ABNORMAL: 7		
		ELECTROCARDIOGRAM ST-T CHANGE: 30				
			ELECTROCARDIOGRAM POOR R-WAVE PROGRESSION: 9					
			ELECTROCARDIOGRAM Q WAVES: 4						
			ELECTROCARDIOGRAM T WAVE ABNORMAL: 20						
			ELECTROCARDIOGRAM T WAVE AMPLITUDE DECREASED: 5				
			ELECTROCARDIOGRAM T WAVE PEAKED: 3					
			ELECTROCARDIOGRAM T WAVE INVERSION: 32					
			ELECTROCARDIOGRAM P WAVE ABNORMAL: 3						
			ELECTROCARDIOGRAM PR PROLONGATION: 4					
			ELECTROCARDIOGRAM PR SHORTENED: 2					
			ELECTROCARDIOGRAM ST SEGMENT: 3						
			ELECTROCARDIOGRAM ST SEGMENT DEPRESSION: 29					
			ELECTROCARDIOGRAM ST-T CHANGE: 30						
			ELECTROCARDIOGRAM ST-T SEGMENT ABNORMAL: 5					
			ELECTROCARDIOGRAM ST-T SEGMENT DEPRESSION: 1				
			ELECTROCARDIOGRAM QT INTERVAL ABNORMAL: 2				
			ELECTROCARDIOGRAM QT PROLONGED: 116					
			ELECTROCARDIOGRAM QT CORRECTED INTERVAL PROLONGED: 28		
			TORSADE DE POINTES: 50				
			LONG QT SYNDROME: 1				
			ELECTROCARDIOGRAM QT SHORTENED: 2					
			ELECTROCARDIOGRAM QRS COMPLEX ABNORMAL: 5				
			ELECTROCARDIOGRAM REPOLARISATION ABNORMALITY: 4			
			ELECTROCARDIOGRAM AMBULATORY ABNORMAL: 1				
			ELECTROCARDIOGRAM QRS COMPLEX PROLONGED: 10			
			ELECTROCARDIOGRAM QRS COMPLEX SHORTENED: 1				
			QRS AXIS ABNORMAL: 13
		d. Risk Factor for Death/Sudden Death: Low Cardiac Output
			CARDIAC FAILURE: 515					
			CARDIAC FAILURE CONGESTIVE: 946				
			CARDIAC FAILURE ACUTE: 54				
			CARDIAC FAILURE CHRONIC: 11				
			VENTRICULAR FAILURE: 2				
			RIGHT VENTRICULAR FAILURE: 27			
			VENOUS PRESSURE JUGULAR INCREASED: 2		
			LEFT VENTRICULAR FAILURE: 38			
			CARDIAC ASTHMA: 4		
			GALLOP RHYTHM PRESENT: 5		
		CARDIAC OUTPUT DECREASED: 16					
			CARDIAC TAMPONADE: 28				
			CARDIAC INDEX DECREASED: 2				
			LOW CARDIAC OUTPUT SYNDROME: 6				
			PULSE PRESSURE DECREASED: 8			
			EJECTION FRACTION DECREASED: 138				
			VENTRICULAR DYSKINESIA: 4			
			NEGATIVE CARDIAC INOTROPIC EFFECT: 1				
			LEFT VENTRICULAR END-DIASTOLIC PRESSURE INCREASED: 7				
			RIGHT VENTRICULAR DYSFUNCTION: 1				
			RIGHT VENTRICULAR SYSTOLIC PRESSURE INCREASED: 5			
			RIGHT VENTRICULAR HYPERTROPHY: 2				
			LEFT VENTRICULAR END-DIASTOLIC PRESSURE DECREASED: 3				
			DIASTOLIC DYSFUNCTION: 56				
			SYSTOLIC DYSFUNCTION: 1						
			NOCTURNAL DYSPNOEA: 7				
			DYSPNOEA PAROXYSMAL NOCTURNAL: 17			
			CARDIOVASCULAR FUNCTION TEST ABNORMAL: 1				
			OEDEMA DUE TO CARDIAC DISEASE: 1	
			CONGESTIVE CARDIOMYOPATHY: 21							
		e. Risk Factor for Death/Sudden Death: 	Coronary Atherosclerosis, Myocardial Infarction, Myocardial Ischaemia
		ARTERIOSCLEROSIS CORONARY ARTERY: 126						
			CORONARY ARTERY ATHEROSCLEROSIS: 19						
			CARDIOVASCULAR INSUFFICIENCY: 5					
			CORONARY ARTERY INSUFFICIENCY: 7				
			MYOCARDIAL INFARCTION: 2133						
			ACUTE MYOCARDIAL INFARCTION: 439					
			AGE INDETERMINATE MYOCARDIAL INFARCTION: 1					
			SILENT MYOCARDIAL INFARCTION: 7					
			ACUTE CORONARY SYNDROME: 139					
			CORONARY ARTERY STENOSIS: 179					
			CORONARY OSTIAL STENOSIS: 7				
			CARDIAC ENZYMES INCREASED: 53					
			CORONARY ARTERY OCCLUSION: 366						
			CORONARY ARTERY REOCCLUSION: 4					
			CORONARY ARTERY RESTENOSIS: 22					
			IN-STENT CORONARY ARTERY RESTENOSIS: 38				
			CORONARY ARTERY THROMBOSIS: 46						
			MYOCARDIAL ISCHAEMIA: 274						
			ANGINA PECTORIS: 389					
			ANGINA UNSTABLE: 214				
			POSTINFARCTION ANGINA: 5				
			SUBENDOCARDIAL ISCHAEMIA: 1				
			PRINZMETAL ANGINA: 9				
			ARTERIOSPASM CORONARY: 16				
			ECG SIGNS OF MYOCARDIAL ISCHAEMIA: 6				
			CARDIAC STRESS TEST ABNORMAL: 21
		f. Risk Factor for Death/Sudden Death: Hypokalemia and Hyperkalemia
		HYPERKALAEMIA: 379
		BLOOD POTASSIUM INCREASED: 183
		HYPOKALAEMIA: 341
		BLOOD POTASSIUM DECREASED: 258
	}

	public TreeMap<String, TreeMap<String, ArrayList<String>>> getSideEffectOntology() {
		return sideEffectOntology;
	}

	public static void main(String args[]) {

		SideEffectOntology seo = new SideEffectOntology();
		for (String type : seo.getSideEffectOntology().keySet()) {
			System.out.println(type);
//			for (String sideEffect : seo.getSideEffectOntology().get(type)) {
//				System.out.println("\t" + sideEffect);
//
//			}
		}
	}

}
