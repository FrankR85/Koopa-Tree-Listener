package de.koopa.lg.treewalker;

import koopa.core.trees.Tree;
import de.koopa.lg.treewalker.KoopaTreeHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class CobolBaseTreeListener<T> implements CobolTreeListener<T>{
	private boolean isListening = true;
	private int procedureDivisionCount = 0;
	private static final Logger logger = LogManager.getLogger();

	public CobolBaseTreeListener() {	
	}
	public void enter(Tree tree) {	
		switch(KoopaTreeHelper.getType(tree)) {
			case "eventPointer": enter_eventPointer(tree); break;
			case "blankClause": enter_blankClause(tree); break;
			case "dtAtPositioning": enter_dtAtPositioning(tree); break;
			case "screenEntryPhrase": enter_screenEntryPhrase(tree); break;
			case "standardPhrase": enter_standardPhrase(tree); break;
			case "execSQLStatement": enter_execSQLStatement(tree); break;
			case "transformStatement": enter_transformStatement(tree); break;
			case "enableStatement": enter_enableStatement(tree); break;
			case "functionSpecifier": enter_functionSpecifier(tree); break;
			case "echoPhrase": enter_echoPhrase(tree); break;
			case "waitStatement": enter_waitStatement(tree); break;
			case "dataOutput": enter_dataOutput(tree); break;
			case "destinationClause": enter_destinationClause(tree); break;
			case "usingOrChainingPhrase": enter_usingOrChainingPhrase(tree); break;
			case "fdFileDescriptionEntry": enter_fdFileDescriptionEntry(tree); break;
			case "signType": enter_signType(tree); break;
			case "cdName": enter_cdName(tree); break;
			case "compilerDisplayStatement": enter_compilerDisplayStatement(tree); break;
			case "entryStatement": enter_entryStatement(tree); break;
			case "abbreviatedConjunction": enter_abbreviatedConjunction(tree); break;
			case "TOKEN_VARYING": enter_TOKEN_VARYING(tree); break;
			case "alphanumeric": enter_alphanumeric(tree); break;
			case "rollbackStatement": enter_rollbackStatement(tree); break;
			case "usageClause": enter_usageClause(tree); break;
			case "greaterOrEqualOp": enter_greaterOrEqualOp(tree); break;
			case "dataDescriptionEntry_format3_and_4": enter_dataDescriptionEntry_format3_and_4(tree); break;
			case "subtraction_format2": enter_subtraction_format2(tree); break;
			case "beforeReportingDeclarative": enter_beforeReportingDeclarative(tree); break;
			case "subtraction_format3": enter_subtraction_format3(tree); break;
			case "qualifiedLinageCounter": enter_qualifiedLinageCounter(tree); break;
			case "pageClause": enter_pageClause(tree); break;
			case "subtraction_format1": enter_subtraction_format1(tree); break;
			case "rangeExpression": enter_rangeExpression(tree); break;
			case "justificationPhrase": enter_justificationPhrase(tree); break;
			case "bitwiseInclusiveDisjunction": enter_bitwiseInclusiveDisjunction(tree); break;
			case "enumIdParagraph": enter_enumIdParagraph(tree); break;
			case "object": enter_object(tree); break;
			case "stopStatement": enter_stopStatement(tree); break;
			case "writeStatement": enter_writeStatement(tree); break;
			case "nextGroupClause": enter_nextGroupClause(tree); break;
			case "unitPhrase": enter_unitPhrase(tree); break;
			case "assignToClause": enter_assignToClause(tree); break;
			case "iteratorIdParagraph": enter_iteratorIdParagraph(tree); break;
			case "functionPrototypeIdParagraph": enter_functionPrototypeIdParagraph(tree); break;
			case "relationSubject": enter_relationSubject(tree); break;
			case "endMarker": enter_endMarker(tree); break;
			case "selectClause": enter_selectClause(tree); break;
			case "callConvention": enter_callConvention(tree); break;
			case "setStatement": enter_setStatement(tree); break;
			case "paragraphStart": enter_paragraphStart(tree); break;
			case "accessModeClause": enter_accessModeClause(tree); break;
			case "commitStatement": enter_commitStatement(tree); break;
			case "term": enter_term(tree); break;
			case "sortStatement": enter_sortStatement(tree); break;
			case "nestedCopyStatement": enter_nestedCopyStatement(tree); break;
			case "likeMods": enter_likeMods(tree); break;
			case "tallyingCharactersPhrase": enter_tallyingCharactersPhrase(tree); break;
			case "functionDefinition": enter_functionDefinition(tree); break;
			case "dataDescriptionEntry": enter_dataDescriptionEntry(tree); break;
			case "localeIs": enter_localeIs(tree); break;
			case "sourceComputerParagraph": enter_sourceComputerParagraph(tree); break;
			case "cobolSwitch": enter_cobolSwitch(tree); break;
			case "assemblyAttributesParagraph": enter_assemblyAttributesParagraph(tree); break;
			case "numericSignIs": enter_numericSignIs(tree); break;
			case "operand": enter_operand(tree); break;
			case "returningProcedurePhrase": enter_returningProcedurePhrase(tree); break;
			case "justifiedClause": enter_justifiedClause(tree); break;
			case "suppressClause": enter_suppressClause(tree); break;
			case "TOKEN_EQUAL": enter_TOKEN_EQUAL(tree); break;
			case "timeoutPhrase": enter_timeoutPhrase(tree); break;
			case "attributeClause": enter_attributeClause(tree); break;
			case "parameterName": enter_parameterName(tree); break;
			case "redefinesClause": enter_redefinesClause(tree); break;
			case "TOKEN_TRUE": enter_TOKEN_TRUE(tree); break;
			case "convertPhrase": enter_convertPhrase(tree); break;
			case "foregroundPhrase": enter_foregroundPhrase(tree); break;
			case "communicationDescriptionEntry": enter_communicationDescriptionEntry(tree); break;
			case "screenValueClause": enter_screenValueClause(tree); break;
			case "controlPhrase": enter_controlPhrase(tree); break;
			case "selectStatement": enter_selectStatement(tree); break;
			case "functionIdParagraph": enter_functionIdParagraph(tree); break;
			case "roundedPhrase": enter_roundedPhrase(tree); break;
			case "dataDescriptionEntry_format2": enter_dataDescriptionEntry_format2(tree); break;
			case "dataDescriptionEntry_format1": enter_dataDescriptionEntry_format1(tree); break;
			case "sqlStatement": enter_sqlStatement(tree); break;
			case "unlockStatement": enter_unlockStatement(tree); break;
			case "TOKEN_BY": enter_TOKEN_BY(tree); break;
			case "renamesClause": enter_renamesClause(tree); break;
			case "equalsOp": enter_equalsOp(tree); break;
			case "useStatement": enter_useStatement(tree); break;
			case "commentEntry": enter_commentEntry(tree); break;
			case "setOther": enter_setOther(tree); break;
			case "classCondition": enter_classCondition(tree); break;
			case "erasePhrase": enter_erasePhrase(tree); break;
			case "boldPhrase": enter_boldPhrase(tree); break;
			case "tallyingAllLeadingOrTrailingPhrase": enter_tallyingAllLeadingOrTrailingPhrase(tree); break;
			case "sumClause": enter_sumClause(tree); break;
			case "computeStatement": enter_computeStatement(tree); break;
			case "subtractStatement": enter_subtractStatement(tree); break;
			case "declaratives": enter_declaratives(tree); break;
			case "addition_format1": enter_addition_format1(tree); break;
			case "reverseVideoClause": enter_reverseVideoClause(tree); break;
			case "relationOperand": enter_relationOperand(tree); break;
			case "notAtEnd": enter_notAtEnd(tree); break;
			case "identifiedByStatement": enter_identifiedByStatement(tree); break;
			case "alterationClause": enter_alterationClause(tree); break;
			case "notOnSizeError": enter_notOnSizeError(tree); break;
			case "blankPhrase": enter_blankPhrase(tree); break;
			case "TOKEN_AND": enter_TOKEN_AND(tree); break;
			case "addition_format3": enter_addition_format3(tree); break;
			case "addition_format2": enter_addition_format2(tree); break;
			case "backgroundColorClause": enter_backgroundColorClause(tree); break;
			case "lockModeClause": enter_lockModeClause(tree); break;
			case "methodIdParagraph": enter_methodIdParagraph(tree); break;
			case "terminateStatement": enter_terminateStatement(tree); break;
			case "fileSectionContents": enter_fileSectionContents(tree); break;
			case "locationPhrase": enter_locationPhrase(tree); break;
			case "linePhrase": enter_linePhrase(tree); break;
			case "constantRecordClause": enter_constantRecordClause(tree); break;
			case "recordIsVaryingClause": enter_recordIsVaryingClause(tree); break;
			case "programID": enter_programID(tree); break;
			case "groupIndicateClause": enter_groupIndicateClause(tree); break;
			case "retryPhrase": enter_retryPhrase(tree); break;
			case "dataDivisionBody": enter_dataDivisionBody(tree); break;
			case "searchStatement": enter_searchStatement(tree); break;
			case "cursorPhrase": enter_cursorPhrase(tree); break;
			case "promptPhrase": enter_promptPhrase(tree); break;
			case "TOKEN_NEGATIVE": enter_TOKEN_NEGATIVE(tree); break;
			case "codeClause": enter_codeClause(tree); break;
			case "valueTypeIdParagraph": enter_valueTypeIdParagraph(tree); break;
			case "thenBranch": enter_thenBranch(tree); break;
			case "noData": enter_noData(tree); break;
			case "programIdParagraph": enter_programIdParagraph(tree); break;
			case "TOKEN_ANY": enter_TOKEN_ANY(tree); break;
			case "testPosition": enter_testPosition(tree); break;
			case "TOKEN_THAN": enter_TOKEN_THAN(tree); break;
			case "whenSetToFalseClause": enter_whenSetToFalseClause(tree); break;
			case "columnClause": enter_columnClause(tree); break;
			case "constantEntry": enter_constantEntry(tree); break;
			case "labelDeclarative": enter_labelDeclarative(tree); break;
			case "valueClause": enter_valueClause(tree); break;
			case "simpleCondition": enter_simpleCondition(tree); break;
			case "factoryParagraph": enter_factoryParagraph(tree); break;
			case "collationClause": enter_collationClause(tree); break;
			case "sortStatusClause": enter_sortStatusClause(tree); break;
			case "returningPhrase": enter_returningPhrase(tree); break;
			case "interfaceSpecifier": enter_interfaceSpecifier(tree); break;
			case "execStatement": enter_execStatement(tree); break;
			case "sentence": enter_sentence(tree); break;
			case "highlightClause": enter_highlightClause(tree); break;
			case "alphabetIs": enter_alphabetIs(tree); break;
			case "sharingClause": enter_sharingClause(tree); break;
			case "verb": enter_verb(tree); break;
			case "purgeStatement": enter_purgeStatement(tree); break;
			case "callStatement": enter_callStatement(tree); break;
			case "eventType": enter_eventType(tree); break;
			case "pictureString": enter_pictureString(tree); break;
			case "equalToOp": enter_equalToOp(tree); break;
			case "recordingMode": enter_recordingMode(tree); break;
			case "fullPhrase": enter_fullPhrase(tree); break;
			case "unstringStatement": enter_unstringStatement(tree); break;
			case "reportSectionValueClause": enter_reportSectionValueClause(tree); break;
			case "qualifier": enter_qualifier(tree); break;
			case "reportGroupTypeClause": enter_reportGroupTypeClause(tree); break;
			case "integerConstant": enter_integerConstant(tree); break;
			case "evaluateStatement": enter_evaluateStatement(tree); break;
			case "blinkPhrase": enter_blinkPhrase(tree); break;
			case "onSizeError": enter_onSizeError(tree); break;
			case "specialNamesParagraph": enter_specialNamesParagraph(tree); break;
			case "paragraph": enter_paragraph(tree); break;
			case "acceptFromCommandLine": enter_acceptFromCommandLine(tree); break;
			case "execCICSStatement": enter_execCICSStatement(tree); break;
			case "fileControlEntry": enter_fileControlEntry(tree); break;
			case "readyTraceStatement": enter_readyTraceStatement(tree); break;
			case "sectionName": enter_sectionName(tree); break;
			case "conjunction": enter_conjunction(tree); break;
			case "objectParagraph": enter_objectParagraph(tree); break;
			case "defaultClause": enter_defaultClause(tree); break;
			case "gobackStatement": enter_gobackStatement(tree); break;
			case "blankWhenZeroClause": enter_blankWhenZeroClause(tree); break;
			case "alignedClause": enter_alignedClause(tree); break;
			case "tallyingPhrase": enter_tallyingPhrase(tree); break;
			case "lockModeWithClause": enter_lockModeWithClause(tree); break;
			case "compilerDirective": enter_compilerDirective(tree); break;
			case "eventPhrase": enter_eventPhrase(tree); break;
			case "suppressStatement": enter_suppressStatement(tree); break;
			case "atEndOfPage": enter_atEndOfPage(tree); break;
			case "sdFileDescriptionEntry": enter_sdFileDescriptionEntry(tree); break;
			case "examineStatement": enter_examineStatement(tree); break;
			case "paddingClause": enter_paddingClause(tree); break;
			case "programSpecifier": enter_programSpecifier(tree); break;
			case "atom": enter_atom(tree); break;
			case "TOKEN_POSITIVE": enter_TOKEN_POSITIVE(tree); break;
			case "cursorIs": enter_cursorIs(tree); break;
			case "initiateStatement": enter_initiateStatement(tree); break;
			case "execDLIStatement": enter_execDLIStatement(tree); break;
			case "negation": enter_negation(tree); break;
			case "constant": enter_constant(tree); break;
			case "ioSection": enter_ioSection(tree); break;
			case "acceptScreenSizeData": enter_acceptScreenSizeData(tree); break;
			case "subject": enter_subject(tree); break;
			case "signClause": enter_signClause(tree); break;
			case "readStatement": enter_readStatement(tree); break;
			case "TOKEN_IS": enter_TOKEN_IS(tree); break;
			case "integer": enter_integer(tree); break;
			case "ioControlParagraph": enter_ioControlParagraph(tree); break;
			case "execHTMLStatement": enter_execHTMLStatement(tree); break;
			case "enumDefinition": enter_enumDefinition(tree); break;
			case "dtColPos": enter_dtColPos(tree); break;
			case "alphabetName": enter_alphabetName(tree); break;
			case "backgroundPhrase": enter_backgroundPhrase(tree); break;
			case "whenOther": enter_whenOther(tree); break;
			case "dtLineColPositioning": enter_dtLineColPositioning(tree); break;
			case "trailingSignPhrase": enter_trailingSignPhrase(tree); break;
			case "function": enter_function(tree); break;
			case "dtLinePos": enter_dtLinePos(tree); break;
			case "procedureName": enter_procedureName(tree); break;
			case "continuationOfStatement": enter_continuationOfStatement(tree); break;
			case "setEnvironmentVariable": enter_setEnvironmentVariable(tree); break;
			case "acceptMessageCount": enter_acceptMessageCount(tree); break;
			case "subscript": enter_subscript(tree); break;
			case "genericStringDef": enter_genericStringDef(tree); break;
			case "eventStatusIs": enter_eventStatusIs(tree); break;
			case "indexName": enter_indexName(tree); break;
			case "delegateName": enter_delegateName(tree); break;
			case "invokeStatement": enter_invokeStatement(tree); break;
			case "whileKeyModifier": enter_whileKeyModifier(tree); break;
			case "performStatement": enter_performStatement(tree); break;
			case "displayStatement": enter_displayStatement(tree); break;
			case "callPrototypeDefinition": enter_callPrototypeDefinition(tree); break;
			case "convertingPhrase": enter_convertingPhrase(tree); break;
			case "TOKEN_INTO": enter_TOKEN_INTO(tree); break;
			case "standard1AlphabetType": enter_standard1AlphabetType(tree); break;
			case "externalClause": enter_externalClause(tree); break;
			case "condition": enter_condition(tree); break;
			case "procedureDivision": enter_procedureDivision(tree); break;
			case "startStatement": enter_startStatement(tree); break;
			case "recordName": enter_recordName(tree); break;
			case "debugDeclarative": enter_debugDeclarative(tree); break;
			case "workingStorageSection": enter_workingStorageSection(tree); break;
			case "sizePhrase": enter_sizePhrase(tree); break;
			case "literalValue": enter_literalValue(tree); break;
			case "fullClause": enter_fullClause(tree); break;
			case "controlClause": enter_controlClause(tree); break;
			case "moveStatement": enter_moveStatement(tree); break;
			case "recordKeyClause": enter_recordKeyClause(tree); break;
			case "configurationSection": enter_configurationSection(tree); break;
			case "threadLocalClause": enter_threadLocalClause(tree); break;
			case "raiseStatement": enter_raiseStatement(tree); break;
			case "acceptFromDate": enter_acceptFromDate(tree); break;
			case "classIdParagraph": enter_classIdParagraph(tree); break;
			case "chainUsing": enter_chainUsing(tree); break;
			case "iteratorDefinition": enter_iteratorDefinition(tree); break;
			case "times": enter_times(tree); break;
			case "elseBranch": enter_elseBranch(tree); break;
			case "directSubscript": enter_directSubscript(tree); break;
			case "footingClause": enter_footingClause(tree); break;
			case "dependingOn": enter_dependingOn(tree); break;
			case "TOKEN_NOT": enter_TOKEN_NOT(tree); break;
			case "relativeKeyClause": enter_relativeKeyClause(tree); break;
			case "scrollPhrase": enter_scrollPhrase(tree); break;
			case "environmentDivision": enter_environmentDivision(tree); break;
			case "interfaceName": enter_interfaceName(tree); break;
			case "callUsing": enter_callUsing(tree); break;
			case "blinkClause": enter_blinkClause(tree); break;
			case "recordKeyDefinition": enter_recordKeyDefinition(tree); break;
			case "disjunction": enter_disjunction(tree); break;
			case "functionName": enter_functionName(tree); break;
			case "deleteFileStatement": enter_deleteFileStatement(tree); break;
			case "goToStatement": enter_goToStatement(tree); break;
			case "usageOperand": enter_usageOperand(tree); break;
			case "objectComputerParagraph": enter_objectComputerParagraph(tree); break;
			case "interfaceIdParagraph": enter_interfaceIdParagraph(tree); break;
			case "linesAtBottomClause": enter_linesAtBottomClause(tree); break;
			case "xmlGenerateStatement": enter_xmlGenerateStatement(tree); break;
			case "copybookHoldingBehaviour": enter_copybookHoldingBehaviour(tree); break;
			case "eraseClause": enter_eraseClause(tree); break;
			case "notOnEscape": enter_notOnEscape(tree); break;
			case "until": enter_until(tree); break;
			case "callPrototypeIdParagraph": enter_callPrototypeIdParagraph(tree); break;
			case "typedefClause": enter_typedefClause(tree); break;
			case "replacingPhrase": enter_replacingPhrase(tree); break;
			case "fillPhrase": enter_fillPhrase(tree); break;
			case "TOKEN_REPLACING": enter_TOKEN_REPLACING(tree); break;
			case "sourceUnit": enter_sourceUnit(tree); break;
			case "copybook": enter_copybook(tree); break;
			case "acceptFromOther": enter_acceptFromOther(tree); break;
			case "fileName": enter_fileName(tree); break;
			case "compilationGroup": enter_compilationGroup(tree); break;
			case "metadata": enter_metadata(tree); break;
			case "cobolDevice": enter_cobolDevice(tree); break;
			case "defaultRoundedClause": enter_defaultRoundedClause(tree); break;
			case "screenName": enter_screenName(tree); break;
			case "requiredPhrase": enter_requiredPhrase(tree); break;
			case "bitwiseExclusiveDisjunction": enter_bitwiseExclusiveDisjunction(tree); break;
			case "execTextDataStatement": enter_execTextDataStatement(tree); break;
			case "typeNameTypeClause": enter_typeNameTypeClause(tree); break;
			case "relativeSubscript": enter_relativeSubscript(tree); break;
			case "globalClause": enter_globalClause(tree); break;
			case "nextSentenceStatement": enter_nextSentenceStatement(tree); break;
			case "occursClause": enter_occursClause(tree); break;
			case "replacingAllLeadingFirstOrTrailingPhrase": enter_replacingAllLeadingFirstOrTrailingPhrase(tree); break;
			case "numericLiteral": enter_numericLiteral(tree); break;
			case "classDefinition": enter_classDefinition(tree); break;
			case "initializeStatement": enter_initializeStatement(tree); break;
			case "autoPhrase": enter_autoPhrase(tree); break;
			case "displayTerminalFormat": enter_displayTerminalFormat(tree); break;
			case "notOnException": enter_notOnException(tree); break;
			case "classIs": enter_classIs(tree); break;
			case "atEnd": enter_atEnd(tree); break;
			case "invalidKey": enter_invalidKey(tree); break;
			case "assignClause": enter_assignClause(tree); break;
			case "dataValue": enter_dataValue(tree); break;
			case "propertyValue": enter_propertyValue(tree); break;
			case "exceedsOp": enter_exceedsOp(tree); break;
			case "functionPrototype": enter_functionPrototype(tree); break;
			case "sourceClause": enter_sourceClause(tree); break;
			case "alternateRecordKeyClause": enter_alternateRecordKeyClause(tree); break;
			case "displayStatement__": enter_displayStatement__(tree); break;
			case "consoleIsCRT": enter_consoleIsCRT(tree); break;
			case "valuetypeName": enter_valuetypeName(tree); break;
			case "sizeModifier": enter_sizeModifier(tree); break;
			case "recordContainsClause": enter_recordContainsClause(tree); break;
			case "acceptFromMnemonic": enter_acceptFromMnemonic(tree); break;
			case "linesAtTopClause": enter_linesAtTopClause(tree); break;
			case "multiplication_format2": enter_multiplication_format2(tree); break;
			case "multiplication_format1": enter_multiplication_format1(tree); break;
			case "ioSectionBody": enter_ioSectionBody(tree); break;
			case "valueTypeDefinition": enter_valueTypeDefinition(tree); break;
			case "literalRange": enter_literalRange(tree); break;
			case "returnStatement": enter_returnStatement(tree); break;
			case "arithmeticExpression": enter_arithmeticExpression(tree); break;
			case "relop": enter_relop(tree); break;
			case "uponClause": enter_uponClause(tree); break;
			case "declarativeSection": enter_declarativeSection(tree); break;
			case "abbreviatedNegation": enter_abbreviatedNegation(tree); break;
			case "literal": enter_literal(tree); break;
			case "paragraphName": enter_paragraphName(tree); break;
			case "errorDeclarative": enter_errorDeclarative(tree); break;
			case "deleteStatement": enter_deleteStatement(tree); break;
			case "notAtEndOfPage": enter_notAtEndOfPage(tree); break;
			case "varying": enter_varying(tree); break;
			case "constantEntry_level01": enter_constantEntry_level01(tree); break;
			case "foregroundColorClause": enter_foregroundColorClause(tree); break;
			case "repositoryParagraph": enter_repositoryParagraph(tree); break;
			case "constantValueClause": enter_constantValueClause(tree); break;
			case "levelNumber": enter_levelNumber(tree); break;
			case "gridPhrase": enter_gridPhrase(tree); break;
			case "alphabetType": enter_alphabetType(tree); break;
			case "sectionStart": enter_sectionStart(tree); break;
			case "expression": enter_expression(tree); break;
			case "classClause": enter_classClause(tree); break;
			case "withNoAdvancing": enter_withNoAdvancing(tree); break;
			case "timePhrase": enter_timePhrase(tree); break;
			case "typeSpecifier": enter_typeSpecifier(tree); break;
			case "modeIsBlockPhrase": enter_modeIsBlockPhrase(tree); break;
			case "asciiAlphabetType": enter_asciiAlphabetType(tree); break;
			case "acceptStatement": enter_acceptStatement(tree); break;
			case "division_format3": enter_division_format3(tree); break;
			case "division_format1": enter_division_format1(tree); break;
			case "division_format2": enter_division_format2(tree); break;
			case "interfaceDefinition": enter_interfaceDefinition(tree); break;
			case "propertyName": enter_propertyName(tree); break;
			case "mergeStatement": enter_mergeStatement(tree); break;
			case "withData": enter_withData(tree); break;
			case "TOKEN_TO": enter_TOKEN_TO(tree); break;
			case "recordDescriptionEntry": enter_recordDescriptionEntry(tree); break;
			case "xmlSchemaIs": enter_xmlSchemaIs(tree); break;
			case "TOKEN_GIVING": enter_TOKEN_GIVING(tree); break;
			case "justified": enter_justified(tree); break;
			case "TOKEN_LENGTH": enter_TOKEN_LENGTH(tree); break;
			case "communicationSection": enter_communicationSection(tree); break;
			case "codeNameAlphabetType": enter_codeNameAlphabetType(tree); break;
			case "zero": enter_zero(tree); break;
			case "onEscape": enter_onEscape(tree); break;
			case "conditionNameCondition": enter_conditionNameCondition(tree); break;
			case "underlineClause": enter_underlineClause(tree); break;
			case "autoClause": enter_autoClause(tree); break;
			case "lessThanOp": enter_lessThanOp(tree); break;
			case "screenFromClause": enter_screenFromClause(tree); break;
			case "offPhrase": enter_offPhrase(tree); break;
			case "fileStatusClause": enter_fileStatusClause(tree); break;
			case "formatClause": enter_formatClause(tree); break;
			case "closeStatement": enter_closeStatement(tree); break;
			case "beepPhrase": enter_beepPhrase(tree); break;
			case "delegateDefinition": enter_delegateDefinition(tree); break;
			case "byteLengthPhrase": enter_byteLengthPhrase(tree); break;
			case "exhibitStatement": enter_exhibitStatement(tree); break;
			case "dataDivision": enter_dataDivision(tree); break;
			case "TOKEN_FALSE": enter_TOKEN_FALSE(tree); break;
			case "addStatement": enter_addStatement(tree); break;
			case "standard2AlphabetType": enter_standard2AlphabetType(tree); break;
			case "explicitAlphabetType": enter_explicitAlphabetType(tree); break;
			case "name": enter_name(tree); break;
			case "blockContainsClause": enter_blockContainsClause(tree); break;
			case "inspectStatement": enter_inspectStatement(tree); break;
			case "TOKEN_AFTER": enter_TOKEN_AFTER(tree); break;
			case "objectSectionBody": enter_objectSectionBody(tree); break;
			case "copybookHoldingData": enter_copybookHoldingData(tree); break;
			case "entryConventionClause": enter_entryConventionClause(tree); break;
			case "linageClause": enter_linageClause(tree); break;
			case "reportName": enter_reportName(tree); break;
			case "replacingCharactersPhrase": enter_replacingCharactersPhrase(tree); break;
			case "exitStatement": enter_exitStatement(tree); break;
			case "unequalToOp": enter_unequalToOp(tree); break;
			case "qualifiedDataName": enter_qualifiedDataName(tree); break;
			case "codeSetClause": enter_codeSetClause(tree); break;
			case "programPrototype": enter_programPrototype(tree); break;
			case "updatePhrase": enter_updatePhrase(tree); break;
			case "TOKEN_OR": enter_TOKEN_OR(tree); break;
			case "allocateStatement": enter_allocateStatement(tree); break;
			case "varyingClause": enter_varyingClause(tree); break;
			case "omittedArgumentCondition": enter_omittedArgumentCondition(tree); break;
			case "requiredClause": enter_requiredClause(tree); break;
			case "callGivingOrReturning": enter_callGivingOrReturning(tree); break;
			case "environmentDivisionBody": enter_environmentDivisionBody(tree); break;
			case "sendStatement": enter_sendStatement(tree); break;
			case "statement": enter_statement(tree); break;
			case "attributeName": enter_attributeName(tree); break;
			case "factor": enter_factor(tree); break;
			case "figurativeConstant": enter_figurativeConstant(tree); break;
			case "TOKEN_FROM": enter_TOKEN_FROM(tree); break;
			case "valueOf": enter_valueOf(tree); break;
			case "fileControlParagraph": enter_fileControlParagraph(tree); break;
			case "readLockClause": enter_readLockClause(tree); break;
			case "assignUsingClause": enter_assignUsingClause(tree); break;
			case "ifStatement": enter_ifStatement(tree); break;
			case "pictureLocaleClause": enter_pictureLocaleClause(tree); break;
			case "identifier_format6": enter_identifier_format6(tree); break;
			case "organizationClause": enter_organizationClause(tree); break;
			case "diskClause": enter_diskClause(tree); break;
			case "decimalIsComma": enter_decimalIsComma(tree); break;
			case "reportGroupUsageClause": enter_reportGroupUsageClause(tree); break;
			case "endOfStatementMarker": enter_endOfStatementMarker(tree); break;
			case "identifier_format1": enter_identifier_format1(tree); break;
			case "identifier_format2": enter_identifier_format2(tree); break;
			case "base": enter_base(tree); break;
			case "programDefinition": enter_programDefinition(tree); break;
			case "screenDescriptionEntry": enter_screenDescriptionEntry(tree); break;
			case "communicationDescriptionEntry_format2": enter_communicationDescriptionEntry_format2(tree); break;
			case "sameAsClause": enter_sameAsClause(tree); break;
			case "communicationDescriptionEntry_format3": enter_communicationDescriptionEntry_format3(tree); break;
			case "objectSection": enter_objectSection(tree); break;
			case "dataRecords": enter_dataRecords(tree); break;
			case "relationObject": enter_relationObject(tree); break;
			case "arithmeticClause": enter_arithmeticClause(tree); break;
			case "methodDefinition": enter_methodDefinition(tree); break;
			case "fileDescriptionEntry": enter_fileDescriptionEntry(tree); break;
			case "when": enter_when(tree); break;
			case "communicationDescriptionEntry_format1": enter_communicationDescriptionEntry_format1(tree); break;
			case "capitalizationPhrase": enter_capitalizationPhrase(tree); break;
			case "screenSection": enter_screenSection(tree); break;
			case "optionsParagraph": enter_optionsParagraph(tree); break;
			case "moreArithmeticOp": enter_moreArithmeticOp(tree); break;
			case "programName": enter_programName(tree); break;
			case "environmentName": enter_environmentName(tree); break;
			case "alterStatement": enter_alterStatement(tree); break;
			case "stringStatement": enter_stringStatement(tree); break;
			case "identifier": enter_identifier(tree); break;
			case "referenceModifier": enter_referenceModifier(tree); break;
			case "threadLocalStorageSection": enter_threadLocalStorageSection(tree); break;
			case "screenControlIs": enter_screenControlIs(tree); break;
			case "readWithClause": enter_readWithClause(tree); break;
			case "specialNameStatement": enter_specialNameStatement(tree); break;
			case "recordClause": enter_recordClause(tree); break;
			case "replacingInitClause": enter_replacingInitClause(tree); break;
			case "acceptScreenFormat": enter_acceptScreenFormat(tree); break;
			case "mnemonicName": enter_mnemonicName(tree); break;
			case "classAttributesParagraph": enter_classAttributesParagraph(tree); break;
			case "reportDescriptionEntry": enter_reportDescriptionEntry(tree); break;
			case "recordDelimiterClause": enter_recordDelimiterClause(tree); break;
			case "openStatement": enter_openStatement(tree); break;
			case "currencySignIs": enter_currencySignIs(tree); break;
			case "threadPointer": enter_threadPointer(tree); break;
			case "constraintsParagraph": enter_constraintsParagraph(tree); break;
			case "notOnOverflow": enter_notOnOverflow(tree); break;
			case "tabPhrase": enter_tabPhrase(tree); break;
			case "typeName": enter_typeName(tree); break;
			case "className": enter_className(tree); break;
			case "onException": enter_onException(tree); break;
			case "divisionStart": enter_divisionStart(tree); break;
			case "segmentNumber": enter_segmentNumber(tree); break;
			case "concatenatedLiteral": enter_concatenatedLiteral(tree); break;
			case "securePhrase": enter_securePhrase(tree); break;
			case "fileSection": enter_fileSection(tree); break;
			case "computerName": enter_computerName(tree); break;
			case "factoryDefinition": enter_factoryDefinition(tree); break;
			case "cancelStatement": enter_cancelStatement(tree); break;
			case "procedureDivisionHeader": enter_procedureDivisionHeader(tree); break;
			case "crtStatusIs": enter_crtStatusIs(tree); break;
			case "passwordClause": enter_passwordClause(tree); break;
			case "basedClause": enter_basedClause(tree); break;
			case "operatorDefinition": enter_operatorDefinition(tree); break;
			case "generateStatement": enter_generateStatement(tree); break;
			case "configurationSectionBody": enter_configurationSectionBody(tree); break;
			case "programPrototypeIdParagraph": enter_programPrototypeIdParagraph(tree); break;
			case "abbreviatedDisjunction": enter_abbreviatedDisjunction(tree); break;
			case "TOKEN_ELSE": enter_TOKEN_ELSE(tree); break;
			case "reportSection": enter_reportSection(tree); break;
			case "resetTraceStatement": enter_resetTraceStatement(tree); break;
			case "delegateIdParagraph": enter_delegateIdParagraph(tree); break;
			case "propertySpecifier": enter_propertySpecifier(tree); break;
			case "anyLengthClause": enter_anyLengthClause(tree); break;
			case "symbolicChars": enter_symbolicChars(tree); break;
			case "iteratorName": enter_iteratorName(tree); break;
			case "multiplyStatement": enter_multiplyStatement(tree); break;
			case "linkageSection": enter_linkageSection(tree); break;
			case "constantEntry_level78": enter_constantEntry_level78(tree); break;
			case "intermediateRoundingClause": enter_intermediateRoundingClause(tree); break;
			case "screenToClause": enter_screenToClause(tree); break;
			case "lengthPhrase": enter_lengthPhrase(tree); break;
			case "chainStatement": enter_chainStatement(tree); break;
			case "presentWhenClause": enter_presentWhenClause(tree); break;
			case "highPhrase": enter_highPhrase(tree); break;
			case "reversePhrase": enter_reversePhrase(tree); break;
			case "dataReference": enter_dataReference(tree); break;
			case "argument": enter_argument(tree); break;
			case "secureClause": enter_secureClause(tree); break;
			case "greaterThanOp": enter_greaterThanOp(tree); break;
			case "section": enter_section(tree); break;
			case "conditionName": enter_conditionName(tree); break;
			case "serviceStatement": enter_serviceStatement(tree); break;
			case "dataAddressIdentifier": enter_dataAddressIdentifier(tree); break;
			case "operatorIdParagraph": enter_operatorIdParagraph(tree); break;
			case "notInvalidKey": enter_notInvalidKey(tree); break;
			case "space": enter_space(tree); break;
			case "nestedStatements": enter_nestedStatements(tree); break;
			case "divideStatement": enter_divideStatement(tree); break;
			case "bitwiseConjunction": enter_bitwiseConjunction(tree); break;
			case "propertyClause": enter_propertyClause(tree); break;
			case "valueOfFileId": enter_valueOfFileId(tree); break;
			case "groupUsageClause": enter_groupUsageClause(tree); break;
			case "qualifiedReportCounter": enter_qualifiedReportCounter(tree); break;
			case "cicsStatement": enter_cicsStatement(tree); break;
			case "classControlParagraph": enter_classControlParagraph(tree); break;
			case "lineClause": enter_lineClause(tree); break;
			case "localStorageSection": enter_localStorageSection(tree); break;
			case "reportGroupDescriptionEntry": enter_reportGroupDescriptionEntry(tree); break;
			case "typedefName": enter_typedefName(tree); break;
			case "classSpecifier": enter_classSpecifier(tree); break;
			case "relationCondition": enter_relationCondition(tree); break;
			case "repeatedPhrase": enter_repeatedPhrase(tree); break;
			case "invalidClause": enter_invalidClause(tree); break;
			case "onOverflow": enter_onOverflow(tree); break;
			case "receiveStatement": enter_receiveStatement(tree); break;
			case "instanceDefinition": enter_instanceDefinition(tree); break;
			case "synchronizedClause": enter_synchronizedClause(tree); break;
			case "objectStorageSection": enter_objectStorageSection(tree); break;
			case "TOKEN_COMMENT": enter_TOKEN_COMMENT(tree); break;
			case "onStatement": enter_onStatement(tree); break;
			case "delegateSpecifier": enter_delegateSpecifier(tree); break;
			case "pictureClause": enter_pictureClause(tree); break;
			case "disableStatement": enter_disableStatement(tree); break;
			case "signCondition": enter_signCondition(tree); break;
			case "cicsValue": enter_cicsValue(tree); break;
			case "enumName": enter_enumName(tree); break;
			case "compilerStatement": enter_compilerStatement(tree); break;
			case "classType": enter_classType(tree); break;
			case "validateStatusClause": enter_validateStatusClause(tree); break;
			case "lessOrEqualOp": enter_lessOrEqualOp(tree); break;
			case "xmlParseStatement": enter_xmlParseStatement(tree); break;
			case "numeric": enter_numeric(tree); break;
			case "dataName": enter_dataName(tree); break;
			case "selectWhenClause": enter_selectWhenClause(tree); break;
			case "screenUsingClause": enter_screenUsingClause(tree); break;
			case "freeStatement": enter_freeStatement(tree); break;
			case "replacementTarget": enter_replacementTarget(tree); break;
			case "lowPhrase": enter_lowPhrase(tree); break;
			case "labelRecords": enter_labelRecords(tree); break;
			case "rewriteStatement": enter_rewriteStatement(tree); break;
			case "value": enter_value(tree); break;
			case "TOKEN_EQUALS": enter_TOKEN_EQUALS(tree); break;
			case "displayDeviceFormat": enter_displayDeviceFormat(tree); break;
			case "releaseStatement": enter_releaseStatement(tree); break;
			case "copyOperandName": enter_copyOperandName(tree); break;
			case "bellClause": enter_bellClause(tree); break;
			case "methodName": enter_methodName(tree); break;
			case "nativeAlphabetType": enter_nativeAlphabetType(tree); break;
			case "TOKEN_EQUALSIGN": enter_TOKEN_EQUALSIGN(tree); break;
			case "withDebuggingMode": enter_withDebuggingMode(tree); break;
			case "ebcdicAlphabetType": enter_ebcdicAlphabetType(tree); break;
			case "alphanumericConstant": enter_alphanumericConstant(tree); break;
			case "reportClause": enter_reportClause(tree); break;
			case "parenthesizedCondition": enter_parenthesizedCondition(tree); break;
			case "reserveClause": enter_reserveClause(tree); break;
			case "continueStatement": enter_continueStatement(tree); break;
			case "compilerIfStatement": enter_compilerIfStatement(tree); break;
			case "enumSpecifier": enter_enumSpecifier(tree); break;
			case "blankWhenZero": enter_blankWhenZero(tree); break;
			case "somethingFollowingAStatement": enter_somethingFollowingAStatement(tree); break;

			default: return;
		}
	}

public void exit(Tree tree) {
		switch(KoopaTreeHelper.getType(tree)) {
			case "eventPointer": exit_eventPointer(tree); break;
			case "blankClause": exit_blankClause(tree); break;
			case "dtAtPositioning": exit_dtAtPositioning(tree); break;
			case "screenEntryPhrase": exit_screenEntryPhrase(tree); break;
			case "standardPhrase": exit_standardPhrase(tree); break;
			case "execSQLStatement": exit_execSQLStatement(tree); break;
			case "transformStatement": exit_transformStatement(tree); break;
			case "enableStatement": exit_enableStatement(tree); break;
			case "functionSpecifier": exit_functionSpecifier(tree); break;
			case "echoPhrase": exit_echoPhrase(tree); break;
			case "waitStatement": exit_waitStatement(tree); break;
			case "dataOutput": exit_dataOutput(tree); break;
			case "destinationClause": exit_destinationClause(tree); break;
			case "usingOrChainingPhrase": exit_usingOrChainingPhrase(tree); break;
			case "fdFileDescriptionEntry": exit_fdFileDescriptionEntry(tree); break;
			case "signType": exit_signType(tree); break;
			case "cdName": exit_cdName(tree); break;
			case "compilerDisplayStatement": exit_compilerDisplayStatement(tree); break;
			case "entryStatement": exit_entryStatement(tree); break;
			case "abbreviatedConjunction": exit_abbreviatedConjunction(tree); break;
			case "TOKEN_VARYING": exit_TOKEN_VARYING(tree); break;
			case "alphanumeric": exit_alphanumeric(tree); break;
			case "rollbackStatement": exit_rollbackStatement(tree); break;
			case "usageClause": exit_usageClause(tree); break;
			case "greaterOrEqualOp": exit_greaterOrEqualOp(tree); break;
			case "dataDescriptionEntry_format3_and_4": exit_dataDescriptionEntry_format3_and_4(tree); break;
			case "subtraction_format2": exit_subtraction_format2(tree); break;
			case "beforeReportingDeclarative": exit_beforeReportingDeclarative(tree); break;
			case "subtraction_format3": exit_subtraction_format3(tree); break;
			case "qualifiedLinageCounter": exit_qualifiedLinageCounter(tree); break;
			case "pageClause": exit_pageClause(tree); break;
			case "subtraction_format1": exit_subtraction_format1(tree); break;
			case "rangeExpression": exit_rangeExpression(tree); break;
			case "justificationPhrase": exit_justificationPhrase(tree); break;
			case "bitwiseInclusiveDisjunction": exit_bitwiseInclusiveDisjunction(tree); break;
			case "enumIdParagraph": exit_enumIdParagraph(tree); break;
			case "object": exit_object(tree); break;
			case "stopStatement": exit_stopStatement(tree); break;
			case "writeStatement": exit_writeStatement(tree); break;
			case "nextGroupClause": exit_nextGroupClause(tree); break;
			case "unitPhrase": exit_unitPhrase(tree); break;
			case "assignToClause": exit_assignToClause(tree); break;
			case "iteratorIdParagraph": exit_iteratorIdParagraph(tree); break;
			case "functionPrototypeIdParagraph": exit_functionPrototypeIdParagraph(tree); break;
			case "relationSubject": exit_relationSubject(tree); break;
			case "endMarker": exit_endMarker(tree); break;
			case "selectClause": exit_selectClause(tree); break;
			case "callConvention": exit_callConvention(tree); break;
			case "setStatement": exit_setStatement(tree); break;
			case "paragraphStart": exit_paragraphStart(tree); break;
			case "accessModeClause": exit_accessModeClause(tree); break;
			case "commitStatement": exit_commitStatement(tree); break;
			case "term": exit_term(tree); break;
			case "sortStatement": exit_sortStatement(tree); break;
			case "nestedCopyStatement": exit_nestedCopyStatement(tree); break;
			case "likeMods": exit_likeMods(tree); break;
			case "tallyingCharactersPhrase": exit_tallyingCharactersPhrase(tree); break;
			case "functionDefinition": exit_functionDefinition(tree); break;
			case "dataDescriptionEntry": exit_dataDescriptionEntry(tree); break;
			case "localeIs": exit_localeIs(tree); break;
			case "sourceComputerParagraph": exit_sourceComputerParagraph(tree); break;
			case "cobolSwitch": exit_cobolSwitch(tree); break;
			case "assemblyAttributesParagraph": exit_assemblyAttributesParagraph(tree); break;
			case "numericSignIs": exit_numericSignIs(tree); break;
			case "operand": exit_operand(tree); break;
			case "returningProcedurePhrase": exit_returningProcedurePhrase(tree); break;
			case "justifiedClause": exit_justifiedClause(tree); break;
			case "suppressClause": exit_suppressClause(tree); break;
			case "TOKEN_EQUAL": exit_TOKEN_EQUAL(tree); break;
			case "timeoutPhrase": exit_timeoutPhrase(tree); break;
			case "attributeClause": exit_attributeClause(tree); break;
			case "parameterName": exit_parameterName(tree); break;
			case "redefinesClause": exit_redefinesClause(tree); break;
			case "TOKEN_TRUE": exit_TOKEN_TRUE(tree); break;
			case "convertPhrase": exit_convertPhrase(tree); break;
			case "foregroundPhrase": exit_foregroundPhrase(tree); break;
			case "communicationDescriptionEntry": exit_communicationDescriptionEntry(tree); break;
			case "screenValueClause": exit_screenValueClause(tree); break;
			case "controlPhrase": exit_controlPhrase(tree); break;
			case "selectStatement": exit_selectStatement(tree); break;
			case "functionIdParagraph": exit_functionIdParagraph(tree); break;
			case "roundedPhrase": exit_roundedPhrase(tree); break;
			case "dataDescriptionEntry_format2": exit_dataDescriptionEntry_format2(tree); break;
			case "dataDescriptionEntry_format1": exit_dataDescriptionEntry_format1(tree); break;
			case "sqlStatement": exit_sqlStatement(tree); break;
			case "unlockStatement": exit_unlockStatement(tree); break;
			case "TOKEN_BY": exit_TOKEN_BY(tree); break;
			case "renamesClause": exit_renamesClause(tree); break;
			case "equalsOp": exit_equalsOp(tree); break;
			case "useStatement": exit_useStatement(tree); break;
			case "commentEntry": exit_commentEntry(tree); break;
			case "setOther": exit_setOther(tree); break;
			case "classCondition": exit_classCondition(tree); break;
			case "erasePhrase": exit_erasePhrase(tree); break;
			case "boldPhrase": exit_boldPhrase(tree); break;
			case "tallyingAllLeadingOrTrailingPhrase": exit_tallyingAllLeadingOrTrailingPhrase(tree); break;
			case "sumClause": exit_sumClause(tree); break;
			case "computeStatement": exit_computeStatement(tree); break;
			case "subtractStatement": exit_subtractStatement(tree); break;
			case "declaratives": exit_declaratives(tree); break;
			case "addition_format1": exit_addition_format1(tree); break;
			case "reverseVideoClause": exit_reverseVideoClause(tree); break;
			case "relationOperand": exit_relationOperand(tree); break;
			case "notAtEnd": exit_notAtEnd(tree); break;
			case "identifiedByStatement": exit_identifiedByStatement(tree); break;
			case "alterationClause": exit_alterationClause(tree); break;
			case "notOnSizeError": exit_notOnSizeError(tree); break;
			case "blankPhrase": exit_blankPhrase(tree); break;
			case "TOKEN_AND": exit_TOKEN_AND(tree); break;
			case "addition_format3": exit_addition_format3(tree); break;
			case "addition_format2": exit_addition_format2(tree); break;
			case "backgroundColorClause": exit_backgroundColorClause(tree); break;
			case "lockModeClause": exit_lockModeClause(tree); break;
			case "methodIdParagraph": exit_methodIdParagraph(tree); break;
			case "terminateStatement": exit_terminateStatement(tree); break;
			case "fileSectionContents": exit_fileSectionContents(tree); break;
			case "locationPhrase": exit_locationPhrase(tree); break;
			case "linePhrase": exit_linePhrase(tree); break;
			case "constantRecordClause": exit_constantRecordClause(tree); break;
			case "recordIsVaryingClause": exit_recordIsVaryingClause(tree); break;
			case "programID": exit_programID(tree); break;
			case "groupIndicateClause": exit_groupIndicateClause(tree); break;
			case "retryPhrase": exit_retryPhrase(tree); break;
			case "dataDivisionBody": exit_dataDivisionBody(tree); break;
			case "searchStatement": exit_searchStatement(tree); break;
			case "cursorPhrase": exit_cursorPhrase(tree); break;
			case "promptPhrase": exit_promptPhrase(tree); break;
			case "TOKEN_NEGATIVE": exit_TOKEN_NEGATIVE(tree); break;
			case "codeClause": exit_codeClause(tree); break;
			case "valueTypeIdParagraph": exit_valueTypeIdParagraph(tree); break;
			case "thenBranch": exit_thenBranch(tree); break;
			case "noData": exit_noData(tree); break;
			case "programIdParagraph": exit_programIdParagraph(tree); break;
			case "TOKEN_ANY": exit_TOKEN_ANY(tree); break;
			case "testPosition": exit_testPosition(tree); break;
			case "TOKEN_THAN": exit_TOKEN_THAN(tree); break;
			case "whenSetToFalseClause": exit_whenSetToFalseClause(tree); break;
			case "columnClause": exit_columnClause(tree); break;
			case "constantEntry": exit_constantEntry(tree); break;
			case "labelDeclarative": exit_labelDeclarative(tree); break;
			case "valueClause": exit_valueClause(tree); break;
			case "simpleCondition": exit_simpleCondition(tree); break;
			case "factoryParagraph": exit_factoryParagraph(tree); break;
			case "collationClause": exit_collationClause(tree); break;
			case "sortStatusClause": exit_sortStatusClause(tree); break;
			case "returningPhrase": exit_returningPhrase(tree); break;
			case "interfaceSpecifier": exit_interfaceSpecifier(tree); break;
			case "execStatement": exit_execStatement(tree); break;
			case "sentence": exit_sentence(tree); break;
			case "highlightClause": exit_highlightClause(tree); break;
			case "alphabetIs": exit_alphabetIs(tree); break;
			case "sharingClause": exit_sharingClause(tree); break;
			case "verb": exit_verb(tree); break;
			case "purgeStatement": exit_purgeStatement(tree); break;
			case "callStatement": exit_callStatement(tree); break;
			case "eventType": exit_eventType(tree); break;
			case "pictureString": exit_pictureString(tree); break;
			case "equalToOp": exit_equalToOp(tree); break;
			case "recordingMode": exit_recordingMode(tree); break;
			case "fullPhrase": exit_fullPhrase(tree); break;
			case "unstringStatement": exit_unstringStatement(tree); break;
			case "reportSectionValueClause": exit_reportSectionValueClause(tree); break;
			case "qualifier": exit_qualifier(tree); break;
			case "reportGroupTypeClause": exit_reportGroupTypeClause(tree); break;
			case "integerConstant": exit_integerConstant(tree); break;
			case "evaluateStatement": exit_evaluateStatement(tree); break;
			case "blinkPhrase": exit_blinkPhrase(tree); break;
			case "onSizeError": exit_onSizeError(tree); break;
			case "specialNamesParagraph": exit_specialNamesParagraph(tree); break;
			case "paragraph": exit_paragraph(tree); break;
			case "acceptFromCommandLine": exit_acceptFromCommandLine(tree); break;
			case "execCICSStatement": exit_execCICSStatement(tree); break;
			case "fileControlEntry": exit_fileControlEntry(tree); break;
			case "readyTraceStatement": exit_readyTraceStatement(tree); break;
			case "sectionName": exit_sectionName(tree); break;
			case "conjunction": exit_conjunction(tree); break;
			case "objectParagraph": exit_objectParagraph(tree); break;
			case "defaultClause": exit_defaultClause(tree); break;
			case "gobackStatement": exit_gobackStatement(tree); break;
			case "blankWhenZeroClause": exit_blankWhenZeroClause(tree); break;
			case "alignedClause": exit_alignedClause(tree); break;
			case "tallyingPhrase": exit_tallyingPhrase(tree); break;
			case "lockModeWithClause": exit_lockModeWithClause(tree); break;
			case "compilerDirective": exit_compilerDirective(tree); break;
			case "eventPhrase": exit_eventPhrase(tree); break;
			case "suppressStatement": exit_suppressStatement(tree); break;
			case "atEndOfPage": exit_atEndOfPage(tree); break;
			case "sdFileDescriptionEntry": exit_sdFileDescriptionEntry(tree); break;
			case "examineStatement": exit_examineStatement(tree); break;
			case "paddingClause": exit_paddingClause(tree); break;
			case "programSpecifier": exit_programSpecifier(tree); break;
			case "atom": exit_atom(tree); break;
			case "TOKEN_POSITIVE": exit_TOKEN_POSITIVE(tree); break;
			case "cursorIs": exit_cursorIs(tree); break;
			case "initiateStatement": exit_initiateStatement(tree); break;
			case "execDLIStatement": exit_execDLIStatement(tree); break;
			case "negation": exit_negation(tree); break;
			case "constant": exit_constant(tree); break;
			case "ioSection": exit_ioSection(tree); break;
			case "acceptScreenSizeData": exit_acceptScreenSizeData(tree); break;
			case "subject": exit_subject(tree); break;
			case "signClause": exit_signClause(tree); break;
			case "readStatement": exit_readStatement(tree); break;
			case "TOKEN_IS": exit_TOKEN_IS(tree); break;
			case "integer": exit_integer(tree); break;
			case "ioControlParagraph": exit_ioControlParagraph(tree); break;
			case "execHTMLStatement": exit_execHTMLStatement(tree); break;
			case "enumDefinition": exit_enumDefinition(tree); break;
			case "dtColPos": exit_dtColPos(tree); break;
			case "alphabetName": exit_alphabetName(tree); break;
			case "backgroundPhrase": exit_backgroundPhrase(tree); break;
			case "whenOther": exit_whenOther(tree); break;
			case "dtLineColPositioning": exit_dtLineColPositioning(tree); break;
			case "trailingSignPhrase": exit_trailingSignPhrase(tree); break;
			case "function": exit_function(tree); break;
			case "dtLinePos": exit_dtLinePos(tree); break;
			case "procedureName": exit_procedureName(tree); break;
			case "continuationOfStatement": exit_continuationOfStatement(tree); break;
			case "setEnvironmentVariable": exit_setEnvironmentVariable(tree); break;
			case "acceptMessageCount": exit_acceptMessageCount(tree); break;
			case "subscript": exit_subscript(tree); break;
			case "genericStringDef": exit_genericStringDef(tree); break;
			case "eventStatusIs": exit_eventStatusIs(tree); break;
			case "indexName": exit_indexName(tree); break;
			case "delegateName": exit_delegateName(tree); break;
			case "invokeStatement": exit_invokeStatement(tree); break;
			case "whileKeyModifier": exit_whileKeyModifier(tree); break;
			case "performStatement": exit_performStatement(tree); break;
			case "displayStatement": exit_displayStatement(tree); break;
			case "callPrototypeDefinition": exit_callPrototypeDefinition(tree); break;
			case "convertingPhrase": exit_convertingPhrase(tree); break;
			case "TOKEN_INTO": exit_TOKEN_INTO(tree); break;
			case "standard1AlphabetType": exit_standard1AlphabetType(tree); break;
			case "externalClause": exit_externalClause(tree); break;
			case "condition": exit_condition(tree); break;
			case "procedureDivision": exit_procedureDivision(tree); break;
			case "startStatement": exit_startStatement(tree); break;
			case "recordName": exit_recordName(tree); break;
			case "debugDeclarative": exit_debugDeclarative(tree); break;
			case "workingStorageSection": exit_workingStorageSection(tree); break;
			case "sizePhrase": exit_sizePhrase(tree); break;
			case "literalValue": exit_literalValue(tree); break;
			case "fullClause": exit_fullClause(tree); break;
			case "controlClause": exit_controlClause(tree); break;
			case "moveStatement": exit_moveStatement(tree); break;
			case "recordKeyClause": exit_recordKeyClause(tree); break;
			case "configurationSection": exit_configurationSection(tree); break;
			case "threadLocalClause": exit_threadLocalClause(tree); break;
			case "raiseStatement": exit_raiseStatement(tree); break;
			case "acceptFromDate": exit_acceptFromDate(tree); break;
			case "classIdParagraph": exit_classIdParagraph(tree); break;
			case "chainUsing": exit_chainUsing(tree); break;
			case "iteratorDefinition": exit_iteratorDefinition(tree); break;
			case "times": exit_times(tree); break;
			case "elseBranch": exit_elseBranch(tree); break;
			case "directSubscript": exit_directSubscript(tree); break;
			case "footingClause": exit_footingClause(tree); break;
			case "dependingOn": exit_dependingOn(tree); break;
			case "TOKEN_NOT": exit_TOKEN_NOT(tree); break;
			case "relativeKeyClause": exit_relativeKeyClause(tree); break;
			case "scrollPhrase": exit_scrollPhrase(tree); break;
			case "environmentDivision": exit_environmentDivision(tree); break;
			case "interfaceName": exit_interfaceName(tree); break;
			case "callUsing": exit_callUsing(tree); break;
			case "blinkClause": exit_blinkClause(tree); break;
			case "recordKeyDefinition": exit_recordKeyDefinition(tree); break;
			case "disjunction": exit_disjunction(tree); break;
			case "functionName": exit_functionName(tree); break;
			case "deleteFileStatement": exit_deleteFileStatement(tree); break;
			case "goToStatement": exit_goToStatement(tree); break;
			case "usageOperand": exit_usageOperand(tree); break;
			case "objectComputerParagraph": exit_objectComputerParagraph(tree); break;
			case "interfaceIdParagraph": exit_interfaceIdParagraph(tree); break;
			case "linesAtBottomClause": exit_linesAtBottomClause(tree); break;
			case "xmlGenerateStatement": exit_xmlGenerateStatement(tree); break;
			case "copybookHoldingBehaviour": exit_copybookHoldingBehaviour(tree); break;
			case "eraseClause": exit_eraseClause(tree); break;
			case "notOnEscape": exit_notOnEscape(tree); break;
			case "until": exit_until(tree); break;
			case "callPrototypeIdParagraph": exit_callPrototypeIdParagraph(tree); break;
			case "typedefClause": exit_typedefClause(tree); break;
			case "replacingPhrase": exit_replacingPhrase(tree); break;
			case "fillPhrase": exit_fillPhrase(tree); break;
			case "TOKEN_REPLACING": exit_TOKEN_REPLACING(tree); break;
			case "sourceUnit": exit_sourceUnit(tree); break;
			case "copybook": exit_copybook(tree); break;
			case "acceptFromOther": exit_acceptFromOther(tree); break;
			case "fileName": exit_fileName(tree); break;
			case "compilationGroup": exit_compilationGroup(tree); break;
			case "metadata": exit_metadata(tree); break;
			case "cobolDevice": exit_cobolDevice(tree); break;
			case "defaultRoundedClause": exit_defaultRoundedClause(tree); break;
			case "screenName": exit_screenName(tree); break;
			case "requiredPhrase": exit_requiredPhrase(tree); break;
			case "bitwiseExclusiveDisjunction": exit_bitwiseExclusiveDisjunction(tree); break;
			case "execTextDataStatement": exit_execTextDataStatement(tree); break;
			case "typeNameTypeClause": exit_typeNameTypeClause(tree); break;
			case "relativeSubscript": exit_relativeSubscript(tree); break;
			case "globalClause": exit_globalClause(tree); break;
			case "nextSentenceStatement": exit_nextSentenceStatement(tree); break;
			case "occursClause": exit_occursClause(tree); break;
			case "replacingAllLeadingFirstOrTrailingPhrase": exit_replacingAllLeadingFirstOrTrailingPhrase(tree); break;
			case "numericLiteral": exit_numericLiteral(tree); break;
			case "classDefinition": exit_classDefinition(tree); break;
			case "initializeStatement": exit_initializeStatement(tree); break;
			case "autoPhrase": exit_autoPhrase(tree); break;
			case "displayTerminalFormat": exit_displayTerminalFormat(tree); break;
			case "notOnException": exit_notOnException(tree); break;
			case "classIs": exit_classIs(tree); break;
			case "atEnd": exit_atEnd(tree); break;
			case "invalidKey": exit_invalidKey(tree); break;
			case "assignClause": exit_assignClause(tree); break;
			case "dataValue": exit_dataValue(tree); break;
			case "propertyValue": exit_propertyValue(tree); break;
			case "exceedsOp": exit_exceedsOp(tree); break;
			case "functionPrototype": exit_functionPrototype(tree); break;
			case "sourceClause": exit_sourceClause(tree); break;
			case "alternateRecordKeyClause": exit_alternateRecordKeyClause(tree); break;
			case "displayStatement__": exit_displayStatement__(tree); break;
			case "consoleIsCRT": exit_consoleIsCRT(tree); break;
			case "valuetypeName": exit_valuetypeName(tree); break;
			case "sizeModifier": exit_sizeModifier(tree); break;
			case "recordContainsClause": exit_recordContainsClause(tree); break;
			case "acceptFromMnemonic": exit_acceptFromMnemonic(tree); break;
			case "linesAtTopClause": exit_linesAtTopClause(tree); break;
			case "multiplication_format2": exit_multiplication_format2(tree); break;
			case "multiplication_format1": exit_multiplication_format1(tree); break;
			case "ioSectionBody": exit_ioSectionBody(tree); break;
			case "valueTypeDefinition": exit_valueTypeDefinition(tree); break;
			case "literalRange": exit_literalRange(tree); break;
			case "returnStatement": exit_returnStatement(tree); break;
			case "arithmeticExpression": exit_arithmeticExpression(tree); break;
			case "relop": exit_relop(tree); break;
			case "uponClause": exit_uponClause(tree); break;
			case "declarativeSection": exit_declarativeSection(tree); break;
			case "abbreviatedNegation": exit_abbreviatedNegation(tree); break;
			case "literal": exit_literal(tree); break;
			case "paragraphName": exit_paragraphName(tree); break;
			case "errorDeclarative": exit_errorDeclarative(tree); break;
			case "deleteStatement": exit_deleteStatement(tree); break;
			case "notAtEndOfPage": exit_notAtEndOfPage(tree); break;
			case "varying": exit_varying(tree); break;
			case "constantEntry_level01": exit_constantEntry_level01(tree); break;
			case "foregroundColorClause": exit_foregroundColorClause(tree); break;
			case "repositoryParagraph": exit_repositoryParagraph(tree); break;
			case "constantValueClause": exit_constantValueClause(tree); break;
			case "levelNumber": exit_levelNumber(tree); break;
			case "gridPhrase": exit_gridPhrase(tree); break;
			case "alphabetType": exit_alphabetType(tree); break;
			case "sectionStart": exit_sectionStart(tree); break;
			case "expression": exit_expression(tree); break;
			case "classClause": exit_classClause(tree); break;
			case "withNoAdvancing": exit_withNoAdvancing(tree); break;
			case "timePhrase": exit_timePhrase(tree); break;
			case "typeSpecifier": exit_typeSpecifier(tree); break;
			case "modeIsBlockPhrase": exit_modeIsBlockPhrase(tree); break;
			case "asciiAlphabetType": exit_asciiAlphabetType(tree); break;
			case "acceptStatement": exit_acceptStatement(tree); break;
			case "division_format3": exit_division_format3(tree); break;
			case "division_format1": exit_division_format1(tree); break;
			case "division_format2": exit_division_format2(tree); break;
			case "interfaceDefinition": exit_interfaceDefinition(tree); break;
			case "propertyName": exit_propertyName(tree); break;
			case "mergeStatement": exit_mergeStatement(tree); break;
			case "withData": exit_withData(tree); break;
			case "TOKEN_TO": exit_TOKEN_TO(tree); break;
			case "recordDescriptionEntry": exit_recordDescriptionEntry(tree); break;
			case "xmlSchemaIs": exit_xmlSchemaIs(tree); break;
			case "TOKEN_GIVING": exit_TOKEN_GIVING(tree); break;
			case "justified": exit_justified(tree); break;
			case "TOKEN_LENGTH": exit_TOKEN_LENGTH(tree); break;
			case "communicationSection": exit_communicationSection(tree); break;
			case "codeNameAlphabetType": exit_codeNameAlphabetType(tree); break;
			case "zero": exit_zero(tree); break;
			case "onEscape": exit_onEscape(tree); break;
			case "conditionNameCondition": exit_conditionNameCondition(tree); break;
			case "underlineClause": exit_underlineClause(tree); break;
			case "autoClause": exit_autoClause(tree); break;
			case "lessThanOp": exit_lessThanOp(tree); break;
			case "screenFromClause": exit_screenFromClause(tree); break;
			case "offPhrase": exit_offPhrase(tree); break;
			case "fileStatusClause": exit_fileStatusClause(tree); break;
			case "formatClause": exit_formatClause(tree); break;
			case "closeStatement": exit_closeStatement(tree); break;
			case "beepPhrase": exit_beepPhrase(tree); break;
			case "delegateDefinition": exit_delegateDefinition(tree); break;
			case "byteLengthPhrase": exit_byteLengthPhrase(tree); break;
			case "exhibitStatement": exit_exhibitStatement(tree); break;
			case "dataDivision": exit_dataDivision(tree); break;
			case "TOKEN_FALSE": exit_TOKEN_FALSE(tree); break;
			case "addStatement": exit_addStatement(tree); break;
			case "standard2AlphabetType": exit_standard2AlphabetType(tree); break;
			case "explicitAlphabetType": exit_explicitAlphabetType(tree); break;
			case "name": exit_name(tree); break;
			case "blockContainsClause": exit_blockContainsClause(tree); break;
			case "inspectStatement": exit_inspectStatement(tree); break;
			case "TOKEN_AFTER": exit_TOKEN_AFTER(tree); break;
			case "objectSectionBody": exit_objectSectionBody(tree); break;
			case "copybookHoldingData": exit_copybookHoldingData(tree); break;
			case "entryConventionClause": exit_entryConventionClause(tree); break;
			case "linageClause": exit_linageClause(tree); break;
			case "reportName": exit_reportName(tree); break;
			case "replacingCharactersPhrase": exit_replacingCharactersPhrase(tree); break;
			case "exitStatement": exit_exitStatement(tree); break;
			case "unequalToOp": exit_unequalToOp(tree); break;
			case "qualifiedDataName": exit_qualifiedDataName(tree); break;
			case "codeSetClause": exit_codeSetClause(tree); break;
			case "programPrototype": exit_programPrototype(tree); break;
			case "updatePhrase": exit_updatePhrase(tree); break;
			case "TOKEN_OR": exit_TOKEN_OR(tree); break;
			case "allocateStatement": exit_allocateStatement(tree); break;
			case "varyingClause": exit_varyingClause(tree); break;
			case "omittedArgumentCondition": exit_omittedArgumentCondition(tree); break;
			case "requiredClause": exit_requiredClause(tree); break;
			case "callGivingOrReturning": exit_callGivingOrReturning(tree); break;
			case "environmentDivisionBody": exit_environmentDivisionBody(tree); break;
			case "sendStatement": exit_sendStatement(tree); break;
			case "statement": exit_statement(tree); break;
			case "attributeName": exit_attributeName(tree); break;
			case "factor": exit_factor(tree); break;
			case "figurativeConstant": exit_figurativeConstant(tree); break;
			case "TOKEN_FROM": exit_TOKEN_FROM(tree); break;
			case "valueOf": exit_valueOf(tree); break;
			case "fileControlParagraph": exit_fileControlParagraph(tree); break;
			case "readLockClause": exit_readLockClause(tree); break;
			case "assignUsingClause": exit_assignUsingClause(tree); break;
			case "ifStatement": exit_ifStatement(tree); break;
			case "pictureLocaleClause": exit_pictureLocaleClause(tree); break;
			case "identifier_format6": exit_identifier_format6(tree); break;
			case "organizationClause": exit_organizationClause(tree); break;
			case "diskClause": exit_diskClause(tree); break;
			case "decimalIsComma": exit_decimalIsComma(tree); break;
			case "reportGroupUsageClause": exit_reportGroupUsageClause(tree); break;
			case "endOfStatementMarker": exit_endOfStatementMarker(tree); break;
			case "identifier_format1": exit_identifier_format1(tree); break;
			case "identifier_format2": exit_identifier_format2(tree); break;
			case "base": exit_base(tree); break;
			case "programDefinition": exit_programDefinition(tree); break;
			case "screenDescriptionEntry": exit_screenDescriptionEntry(tree); break;
			case "communicationDescriptionEntry_format2": exit_communicationDescriptionEntry_format2(tree); break;
			case "sameAsClause": exit_sameAsClause(tree); break;
			case "communicationDescriptionEntry_format3": exit_communicationDescriptionEntry_format3(tree); break;
			case "objectSection": exit_objectSection(tree); break;
			case "dataRecords": exit_dataRecords(tree); break;
			case "relationObject": exit_relationObject(tree); break;
			case "arithmeticClause": exit_arithmeticClause(tree); break;
			case "methodDefinition": exit_methodDefinition(tree); break;
			case "fileDescriptionEntry": exit_fileDescriptionEntry(tree); break;
			case "when": exit_when(tree); break;
			case "communicationDescriptionEntry_format1": exit_communicationDescriptionEntry_format1(tree); break;
			case "capitalizationPhrase": exit_capitalizationPhrase(tree); break;
			case "screenSection": exit_screenSection(tree); break;
			case "optionsParagraph": exit_optionsParagraph(tree); break;
			case "moreArithmeticOp": exit_moreArithmeticOp(tree); break;
			case "programName": exit_programName(tree); break;
			case "environmentName": exit_environmentName(tree); break;
			case "alterStatement": exit_alterStatement(tree); break;
			case "stringStatement": exit_stringStatement(tree); break;
			case "identifier": exit_identifier(tree); break;
			case "referenceModifier": exit_referenceModifier(tree); break;
			case "threadLocalStorageSection": exit_threadLocalStorageSection(tree); break;
			case "screenControlIs": exit_screenControlIs(tree); break;
			case "readWithClause": exit_readWithClause(tree); break;
			case "specialNameStatement": exit_specialNameStatement(tree); break;
			case "recordClause": exit_recordClause(tree); break;
			case "replacingInitClause": exit_replacingInitClause(tree); break;
			case "acceptScreenFormat": exit_acceptScreenFormat(tree); break;
			case "mnemonicName": exit_mnemonicName(tree); break;
			case "classAttributesParagraph": exit_classAttributesParagraph(tree); break;
			case "reportDescriptionEntry": exit_reportDescriptionEntry(tree); break;
			case "recordDelimiterClause": exit_recordDelimiterClause(tree); break;
			case "openStatement": exit_openStatement(tree); break;
			case "currencySignIs": exit_currencySignIs(tree); break;
			case "threadPointer": exit_threadPointer(tree); break;
			case "constraintsParagraph": exit_constraintsParagraph(tree); break;
			case "notOnOverflow": exit_notOnOverflow(tree); break;
			case "tabPhrase": exit_tabPhrase(tree); break;
			case "typeName": exit_typeName(tree); break;
			case "className": exit_className(tree); break;
			case "onException": exit_onException(tree); break;
			case "divisionStart": exit_divisionStart(tree); break;
			case "segmentNumber": exit_segmentNumber(tree); break;
			case "concatenatedLiteral": exit_concatenatedLiteral(tree); break;
			case "securePhrase": exit_securePhrase(tree); break;
			case "fileSection": exit_fileSection(tree); break;
			case "computerName": exit_computerName(tree); break;
			case "factoryDefinition": exit_factoryDefinition(tree); break;
			case "cancelStatement": exit_cancelStatement(tree); break;
			case "procedureDivisionHeader": exit_procedureDivisionHeader(tree); break;
			case "crtStatusIs": exit_crtStatusIs(tree); break;
			case "passwordClause": exit_passwordClause(tree); break;
			case "basedClause": exit_basedClause(tree); break;
			case "operatorDefinition": exit_operatorDefinition(tree); break;
			case "generateStatement": exit_generateStatement(tree); break;
			case "configurationSectionBody": exit_configurationSectionBody(tree); break;
			case "programPrototypeIdParagraph": exit_programPrototypeIdParagraph(tree); break;
			case "abbreviatedDisjunction": exit_abbreviatedDisjunction(tree); break;
			case "TOKEN_ELSE": exit_TOKEN_ELSE(tree); break;
			case "reportSection": exit_reportSection(tree); break;
			case "resetTraceStatement": exit_resetTraceStatement(tree); break;
			case "delegateIdParagraph": exit_delegateIdParagraph(tree); break;
			case "propertySpecifier": exit_propertySpecifier(tree); break;
			case "anyLengthClause": exit_anyLengthClause(tree); break;
			case "symbolicChars": exit_symbolicChars(tree); break;
			case "iteratorName": exit_iteratorName(tree); break;
			case "multiplyStatement": exit_multiplyStatement(tree); break;
			case "linkageSection": exit_linkageSection(tree); break;
			case "constantEntry_level78": exit_constantEntry_level78(tree); break;
			case "intermediateRoundingClause": exit_intermediateRoundingClause(tree); break;
			case "screenToClause": exit_screenToClause(tree); break;
			case "lengthPhrase": exit_lengthPhrase(tree); break;
			case "chainStatement": exit_chainStatement(tree); break;
			case "presentWhenClause": exit_presentWhenClause(tree); break;
			case "highPhrase": exit_highPhrase(tree); break;
			case "reversePhrase": exit_reversePhrase(tree); break;
			case "dataReference": exit_dataReference(tree); break;
			case "argument": exit_argument(tree); break;
			case "secureClause": exit_secureClause(tree); break;
			case "greaterThanOp": exit_greaterThanOp(tree); break;
			case "section": exit_section(tree); break;
			case "conditionName": exit_conditionName(tree); break;
			case "serviceStatement": exit_serviceStatement(tree); break;
			case "dataAddressIdentifier": exit_dataAddressIdentifier(tree); break;
			case "operatorIdParagraph": exit_operatorIdParagraph(tree); break;
			case "notInvalidKey": exit_notInvalidKey(tree); break;
			case "space": exit_space(tree); break;
			case "nestedStatements": exit_nestedStatements(tree); break;
			case "divideStatement": exit_divideStatement(tree); break;
			case "bitwiseConjunction": exit_bitwiseConjunction(tree); break;
			case "propertyClause": exit_propertyClause(tree); break;
			case "valueOfFileId": exit_valueOfFileId(tree); break;
			case "groupUsageClause": exit_groupUsageClause(tree); break;
			case "qualifiedReportCounter": exit_qualifiedReportCounter(tree); break;
			case "cicsStatement": exit_cicsStatement(tree); break;
			case "classControlParagraph": exit_classControlParagraph(tree); break;
			case "lineClause": exit_lineClause(tree); break;
			case "localStorageSection": exit_localStorageSection(tree); break;
			case "reportGroupDescriptionEntry": exit_reportGroupDescriptionEntry(tree); break;
			case "typedefName": exit_typedefName(tree); break;
			case "classSpecifier": exit_classSpecifier(tree); break;
			case "relationCondition": exit_relationCondition(tree); break;
			case "repeatedPhrase": exit_repeatedPhrase(tree); break;
			case "invalidClause": exit_invalidClause(tree); break;
			case "onOverflow": exit_onOverflow(tree); break;
			case "receiveStatement": exit_receiveStatement(tree); break;
			case "instanceDefinition": exit_instanceDefinition(tree); break;
			case "synchronizedClause": exit_synchronizedClause(tree); break;
			case "objectStorageSection": exit_objectStorageSection(tree); break;
			case "TOKEN_COMMENT": exit_TOKEN_COMMENT(tree); break;
			case "onStatement": exit_onStatement(tree); break;
			case "delegateSpecifier": exit_delegateSpecifier(tree); break;
			case "pictureClause": exit_pictureClause(tree); break;
			case "disableStatement": exit_disableStatement(tree); break;
			case "signCondition": exit_signCondition(tree); break;
			case "cicsValue": exit_cicsValue(tree); break;
			case "enumName": exit_enumName(tree); break;
			case "compilerStatement": exit_compilerStatement(tree); break;
			case "classType": exit_classType(tree); break;
			case "validateStatusClause": exit_validateStatusClause(tree); break;
			case "lessOrEqualOp": exit_lessOrEqualOp(tree); break;
			case "xmlParseStatement": exit_xmlParseStatement(tree); break;
			case "numeric": exit_numeric(tree); break;
			case "dataName": exit_dataName(tree); break;
			case "selectWhenClause": exit_selectWhenClause(tree); break;
			case "screenUsingClause": exit_screenUsingClause(tree); break;
			case "freeStatement": exit_freeStatement(tree); break;
			case "replacementTarget": exit_replacementTarget(tree); break;
			case "lowPhrase": exit_lowPhrase(tree); break;
			case "labelRecords": exit_labelRecords(tree); break;
			case "rewriteStatement": exit_rewriteStatement(tree); break;
			case "value": exit_value(tree); break;
			case "TOKEN_EQUALS": exit_TOKEN_EQUALS(tree); break;
			case "displayDeviceFormat": exit_displayDeviceFormat(tree); break;
			case "releaseStatement": exit_releaseStatement(tree); break;
			case "copyOperandName": exit_copyOperandName(tree); break;
			case "bellClause": exit_bellClause(tree); break;
			case "methodName": exit_methodName(tree); break;
			case "nativeAlphabetType": exit_nativeAlphabetType(tree); break;
			case "TOKEN_EQUALSIGN": exit_TOKEN_EQUALSIGN(tree); break;
			case "withDebuggingMode": exit_withDebuggingMode(tree); break;
			case "ebcdicAlphabetType": exit_ebcdicAlphabetType(tree); break;
			case "alphanumericConstant": exit_alphanumericConstant(tree); break;
			case "reportClause": exit_reportClause(tree); break;
			case "parenthesizedCondition": exit_parenthesizedCondition(tree); break;
			case "reserveClause": exit_reserveClause(tree); break;
			case "continueStatement": exit_continueStatement(tree); break;
			case "compilerIfStatement": exit_compilerIfStatement(tree); break;
			case "enumSpecifier": exit_enumSpecifier(tree); break;
			case "blankWhenZero": exit_blankWhenZero(tree); break;
			case "somethingFollowingAStatement": exit_somethingFollowingAStatement(tree); break;

			default: return;
		}
	}
	protected void checkProcedureDivisionCount() {
		procedureDivisionCount++;
		if (procedureDivisionCount > 1) {
			isListening = false;
		}
	}
	public boolean isListening() {
		return isListening;
	}


	public void enter_eventPointer(Tree tree) { }
	public void exit_eventPointer(Tree tree) { }
	public void enter_blankClause(Tree tree) { }
	public void exit_blankClause(Tree tree) { }
	public void enter_dtAtPositioning(Tree tree) { }
	public void exit_dtAtPositioning(Tree tree) { }
	public void enter_screenEntryPhrase(Tree tree) { }
	public void exit_screenEntryPhrase(Tree tree) { }
	public void enter_standardPhrase(Tree tree) { }
	public void exit_standardPhrase(Tree tree) { }
	public void enter_execSQLStatement(Tree tree) { }
	public void exit_execSQLStatement(Tree tree) { }
	public void enter_transformStatement(Tree tree) { }
	public void exit_transformStatement(Tree tree) { }
	public void enter_enableStatement(Tree tree) { }
	public void exit_enableStatement(Tree tree) { }
	public void enter_functionSpecifier(Tree tree) { }
	public void exit_functionSpecifier(Tree tree) { }
	public void enter_echoPhrase(Tree tree) { }
	public void exit_echoPhrase(Tree tree) { }
	public void enter_waitStatement(Tree tree) { }
	public void exit_waitStatement(Tree tree) { }
	public void enter_dataOutput(Tree tree) { }
	public void exit_dataOutput(Tree tree) { }
	public void enter_destinationClause(Tree tree) { }
	public void exit_destinationClause(Tree tree) { }
	public void enter_usingOrChainingPhrase(Tree tree) { }
	public void exit_usingOrChainingPhrase(Tree tree) { }
	public void enter_fdFileDescriptionEntry(Tree tree) { }
	public void exit_fdFileDescriptionEntry(Tree tree) { }
	public void enter_signType(Tree tree) { }
	public void exit_signType(Tree tree) { }
	public void enter_cdName(Tree tree) { }
	public void exit_cdName(Tree tree) { }
	public void enter_compilerDisplayStatement(Tree tree) { }
	public void exit_compilerDisplayStatement(Tree tree) { }
	public void enter_entryStatement(Tree tree) { }
	public void exit_entryStatement(Tree tree) { }
	public void enter_abbreviatedConjunction(Tree tree) { }
	public void exit_abbreviatedConjunction(Tree tree) { }
	public void enter_TOKEN_VARYING(Tree tree) { }
	public void exit_TOKEN_VARYING(Tree tree) { }
	public void enter_alphanumeric(Tree tree) { }
	public void exit_alphanumeric(Tree tree) { }
	public void enter_rollbackStatement(Tree tree) { }
	public void exit_rollbackStatement(Tree tree) { }
	public void enter_usageClause(Tree tree) { }
	public void exit_usageClause(Tree tree) { }
	public void enter_greaterOrEqualOp(Tree tree) { }
	public void exit_greaterOrEqualOp(Tree tree) { }
	public void enter_dataDescriptionEntry_format3_and_4(Tree tree) { }
	public void exit_dataDescriptionEntry_format3_and_4(Tree tree) { }
	public void enter_subtraction_format2(Tree tree) { }
	public void exit_subtraction_format2(Tree tree) { }
	public void enter_beforeReportingDeclarative(Tree tree) { }
	public void exit_beforeReportingDeclarative(Tree tree) { }
	public void enter_subtraction_format3(Tree tree) { }
	public void exit_subtraction_format3(Tree tree) { }
	public void enter_qualifiedLinageCounter(Tree tree) { }
	public void exit_qualifiedLinageCounter(Tree tree) { }
	public void enter_pageClause(Tree tree) { }
	public void exit_pageClause(Tree tree) { }
	public void enter_subtraction_format1(Tree tree) { }
	public void exit_subtraction_format1(Tree tree) { }
	public void enter_rangeExpression(Tree tree) { }
	public void exit_rangeExpression(Tree tree) { }
	public void enter_justificationPhrase(Tree tree) { }
	public void exit_justificationPhrase(Tree tree) { }
	public void enter_bitwiseInclusiveDisjunction(Tree tree) { }
	public void exit_bitwiseInclusiveDisjunction(Tree tree) { }
	public void enter_enumIdParagraph(Tree tree) { }
	public void exit_enumIdParagraph(Tree tree) { }
	public void enter_object(Tree tree) { }
	public void exit_object(Tree tree) { }
	public void enter_stopStatement(Tree tree) { }
	public void exit_stopStatement(Tree tree) { }
	public void enter_writeStatement(Tree tree) { }
	public void exit_writeStatement(Tree tree) { }
	public void enter_nextGroupClause(Tree tree) { }
	public void exit_nextGroupClause(Tree tree) { }
	public void enter_unitPhrase(Tree tree) { }
	public void exit_unitPhrase(Tree tree) { }
	public void enter_assignToClause(Tree tree) { }
	public void exit_assignToClause(Tree tree) { }
	public void enter_iteratorIdParagraph(Tree tree) { }
	public void exit_iteratorIdParagraph(Tree tree) { }
	public void enter_functionPrototypeIdParagraph(Tree tree) { }
	public void exit_functionPrototypeIdParagraph(Tree tree) { }
	public void enter_relationSubject(Tree tree) { }
	public void exit_relationSubject(Tree tree) { }
	public void enter_endMarker(Tree tree) { }
	public void exit_endMarker(Tree tree) { }
	public void enter_selectClause(Tree tree) { }
	public void exit_selectClause(Tree tree) { }
	public void enter_callConvention(Tree tree) { }
	public void exit_callConvention(Tree tree) { }
	public void enter_setStatement(Tree tree) { }
	public void exit_setStatement(Tree tree) { }
	public void enter_paragraphStart(Tree tree) { }
	public void exit_paragraphStart(Tree tree) { }
	public void enter_accessModeClause(Tree tree) { }
	public void exit_accessModeClause(Tree tree) { }
	public void enter_commitStatement(Tree tree) { }
	public void exit_commitStatement(Tree tree) { }
	public void enter_term(Tree tree) { }
	public void exit_term(Tree tree) { }
	public void enter_sortStatement(Tree tree) { }
	public void exit_sortStatement(Tree tree) { }
	public void enter_nestedCopyStatement(Tree tree) { }
	public void exit_nestedCopyStatement(Tree tree) { }
	public void enter_likeMods(Tree tree) { }
	public void exit_likeMods(Tree tree) { }
	public void enter_tallyingCharactersPhrase(Tree tree) { }
	public void exit_tallyingCharactersPhrase(Tree tree) { }
	public void enter_functionDefinition(Tree tree) { }
	public void exit_functionDefinition(Tree tree) { }
	public void enter_dataDescriptionEntry(Tree tree) { }
	public void exit_dataDescriptionEntry(Tree tree) { }
	public void enter_localeIs(Tree tree) { }
	public void exit_localeIs(Tree tree) { }
	public void enter_sourceComputerParagraph(Tree tree) { }
	public void exit_sourceComputerParagraph(Tree tree) { }
	public void enter_cobolSwitch(Tree tree) { }
	public void exit_cobolSwitch(Tree tree) { }
	public void enter_assemblyAttributesParagraph(Tree tree) { }
	public void exit_assemblyAttributesParagraph(Tree tree) { }
	public void enter_numericSignIs(Tree tree) { }
	public void exit_numericSignIs(Tree tree) { }
	public void enter_operand(Tree tree) { }
	public void exit_operand(Tree tree) { }
	public void enter_returningProcedurePhrase(Tree tree) { }
	public void exit_returningProcedurePhrase(Tree tree) { }
	public void enter_justifiedClause(Tree tree) { }
	public void exit_justifiedClause(Tree tree) { }
	public void enter_suppressClause(Tree tree) { }
	public void exit_suppressClause(Tree tree) { }
	public void enter_TOKEN_EQUAL(Tree tree) { }
	public void exit_TOKEN_EQUAL(Tree tree) { }
	public void enter_timeoutPhrase(Tree tree) { }
	public void exit_timeoutPhrase(Tree tree) { }
	public void enter_attributeClause(Tree tree) { }
	public void exit_attributeClause(Tree tree) { }
	public void enter_parameterName(Tree tree) { }
	public void exit_parameterName(Tree tree) { }
	public void enter_redefinesClause(Tree tree) { }
	public void exit_redefinesClause(Tree tree) { }
	public void enter_TOKEN_TRUE(Tree tree) { }
	public void exit_TOKEN_TRUE(Tree tree) { }
	public void enter_convertPhrase(Tree tree) { }
	public void exit_convertPhrase(Tree tree) { }
	public void enter_foregroundPhrase(Tree tree) { }
	public void exit_foregroundPhrase(Tree tree) { }
	public void enter_communicationDescriptionEntry(Tree tree) { }
	public void exit_communicationDescriptionEntry(Tree tree) { }
	public void enter_screenValueClause(Tree tree) { }
	public void exit_screenValueClause(Tree tree) { }
	public void enter_controlPhrase(Tree tree) { }
	public void exit_controlPhrase(Tree tree) { }
	public void enter_selectStatement(Tree tree) { }
	public void exit_selectStatement(Tree tree) { }
	public void enter_functionIdParagraph(Tree tree) { }
	public void exit_functionIdParagraph(Tree tree) { }
	public void enter_roundedPhrase(Tree tree) { }
	public void exit_roundedPhrase(Tree tree) { }
	public void enter_dataDescriptionEntry_format2(Tree tree) { }
	public void exit_dataDescriptionEntry_format2(Tree tree) { }
	public void enter_dataDescriptionEntry_format1(Tree tree) { }
	public void exit_dataDescriptionEntry_format1(Tree tree) { }
	public void enter_sqlStatement(Tree tree) { }
	public void exit_sqlStatement(Tree tree) { }
	public void enter_unlockStatement(Tree tree) { }
	public void exit_unlockStatement(Tree tree) { }
	public void enter_TOKEN_BY(Tree tree) { }
	public void exit_TOKEN_BY(Tree tree) { }
	public void enter_renamesClause(Tree tree) { }
	public void exit_renamesClause(Tree tree) { }
	public void enter_equalsOp(Tree tree) { }
	public void exit_equalsOp(Tree tree) { }
	public void enter_useStatement(Tree tree) { }
	public void exit_useStatement(Tree tree) { }
	public void enter_commentEntry(Tree tree) { }
	public void exit_commentEntry(Tree tree) { }
	public void enter_setOther(Tree tree) { }
	public void exit_setOther(Tree tree) { }
	public void enter_classCondition(Tree tree) { }
	public void exit_classCondition(Tree tree) { }
	public void enter_erasePhrase(Tree tree) { }
	public void exit_erasePhrase(Tree tree) { }
	public void enter_boldPhrase(Tree tree) { }
	public void exit_boldPhrase(Tree tree) { }
	public void enter_tallyingAllLeadingOrTrailingPhrase(Tree tree) { }
	public void exit_tallyingAllLeadingOrTrailingPhrase(Tree tree) { }
	public void enter_sumClause(Tree tree) { }
	public void exit_sumClause(Tree tree) { }
	public void enter_computeStatement(Tree tree) { }
	public void exit_computeStatement(Tree tree) { }
	public void enter_subtractStatement(Tree tree) { }
	public void exit_subtractStatement(Tree tree) { }
	public void enter_declaratives(Tree tree) { }
	public void exit_declaratives(Tree tree) { }
	public void enter_addition_format1(Tree tree) { }
	public void exit_addition_format1(Tree tree) { }
	public void enter_reverseVideoClause(Tree tree) { }
	public void exit_reverseVideoClause(Tree tree) { }
	public void enter_relationOperand(Tree tree) { }
	public void exit_relationOperand(Tree tree) { }
	public void enter_notAtEnd(Tree tree) { }
	public void exit_notAtEnd(Tree tree) { }
	public void enter_identifiedByStatement(Tree tree) { }
	public void exit_identifiedByStatement(Tree tree) { }
	public void enter_alterationClause(Tree tree) { }
	public void exit_alterationClause(Tree tree) { }
	public void enter_notOnSizeError(Tree tree) { }
	public void exit_notOnSizeError(Tree tree) { }
	public void enter_blankPhrase(Tree tree) { }
	public void exit_blankPhrase(Tree tree) { }
	public void enter_TOKEN_AND(Tree tree) { }
	public void exit_TOKEN_AND(Tree tree) { }
	public void enter_addition_format3(Tree tree) { }
	public void exit_addition_format3(Tree tree) { }
	public void enter_addition_format2(Tree tree) { }
	public void exit_addition_format2(Tree tree) { }
	public void enter_backgroundColorClause(Tree tree) { }
	public void exit_backgroundColorClause(Tree tree) { }
	public void enter_lockModeClause(Tree tree) { }
	public void exit_lockModeClause(Tree tree) { }
	public void enter_methodIdParagraph(Tree tree) { }
	public void exit_methodIdParagraph(Tree tree) { }
	public void enter_terminateStatement(Tree tree) { }
	public void exit_terminateStatement(Tree tree) { }
	public void enter_fileSectionContents(Tree tree) { }
	public void exit_fileSectionContents(Tree tree) { }
	public void enter_locationPhrase(Tree tree) { }
	public void exit_locationPhrase(Tree tree) { }
	public void enter_linePhrase(Tree tree) { }
	public void exit_linePhrase(Tree tree) { }
	public void enter_constantRecordClause(Tree tree) { }
	public void exit_constantRecordClause(Tree tree) { }
	public void enter_recordIsVaryingClause(Tree tree) { }
	public void exit_recordIsVaryingClause(Tree tree) { }
	public void enter_programID(Tree tree) { }
	public void exit_programID(Tree tree) { }
	public void enter_groupIndicateClause(Tree tree) { }
	public void exit_groupIndicateClause(Tree tree) { }
	public void enter_retryPhrase(Tree tree) { }
	public void exit_retryPhrase(Tree tree) { }
	public void enter_dataDivisionBody(Tree tree) { }
	public void exit_dataDivisionBody(Tree tree) { }
	public void enter_searchStatement(Tree tree) { }
	public void exit_searchStatement(Tree tree) { }
	public void enter_cursorPhrase(Tree tree) { }
	public void exit_cursorPhrase(Tree tree) { }
	public void enter_promptPhrase(Tree tree) { }
	public void exit_promptPhrase(Tree tree) { }
	public void enter_TOKEN_NEGATIVE(Tree tree) { }
	public void exit_TOKEN_NEGATIVE(Tree tree) { }
	public void enter_codeClause(Tree tree) { }
	public void exit_codeClause(Tree tree) { }
	public void enter_valueTypeIdParagraph(Tree tree) { }
	public void exit_valueTypeIdParagraph(Tree tree) { }
	public void enter_thenBranch(Tree tree) { }
	public void exit_thenBranch(Tree tree) { }
	public void enter_noData(Tree tree) { }
	public void exit_noData(Tree tree) { }
	public void enter_programIdParagraph(Tree tree) { }
	public void exit_programIdParagraph(Tree tree) { }
	public void enter_TOKEN_ANY(Tree tree) { }
	public void exit_TOKEN_ANY(Tree tree) { }
	public void enter_testPosition(Tree tree) { }
	public void exit_testPosition(Tree tree) { }
	public void enter_TOKEN_THAN(Tree tree) { }
	public void exit_TOKEN_THAN(Tree tree) { }
	public void enter_whenSetToFalseClause(Tree tree) { }
	public void exit_whenSetToFalseClause(Tree tree) { }
	public void enter_columnClause(Tree tree) { }
	public void exit_columnClause(Tree tree) { }
	public void enter_constantEntry(Tree tree) { }
	public void exit_constantEntry(Tree tree) { }
	public void enter_labelDeclarative(Tree tree) { }
	public void exit_labelDeclarative(Tree tree) { }
	public void enter_valueClause(Tree tree) { }
	public void exit_valueClause(Tree tree) { }
	public void enter_simpleCondition(Tree tree) { }
	public void exit_simpleCondition(Tree tree) { }
	public void enter_factoryParagraph(Tree tree) { }
	public void exit_factoryParagraph(Tree tree) { }
	public void enter_collationClause(Tree tree) { }
	public void exit_collationClause(Tree tree) { }
	public void enter_sortStatusClause(Tree tree) { }
	public void exit_sortStatusClause(Tree tree) { }
	public void enter_returningPhrase(Tree tree) { }
	public void exit_returningPhrase(Tree tree) { }
	public void enter_interfaceSpecifier(Tree tree) { }
	public void exit_interfaceSpecifier(Tree tree) { }
	public void enter_execStatement(Tree tree) { }
	public void exit_execStatement(Tree tree) { }
	public void enter_sentence(Tree tree) { }
	public void exit_sentence(Tree tree) { }
	public void enter_highlightClause(Tree tree) { }
	public void exit_highlightClause(Tree tree) { }
	public void enter_alphabetIs(Tree tree) { }
	public void exit_alphabetIs(Tree tree) { }
	public void enter_sharingClause(Tree tree) { }
	public void exit_sharingClause(Tree tree) { }
	public void enter_verb(Tree tree) { }
	public void exit_verb(Tree tree) { }
	public void enter_purgeStatement(Tree tree) { }
	public void exit_purgeStatement(Tree tree) { }
	public void enter_callStatement(Tree tree) { }
	public void exit_callStatement(Tree tree) { }
	public void enter_eventType(Tree tree) { }
	public void exit_eventType(Tree tree) { }
	public void enter_pictureString(Tree tree) { }
	public void exit_pictureString(Tree tree) { }
	public void enter_equalToOp(Tree tree) { }
	public void exit_equalToOp(Tree tree) { }
	public void enter_recordingMode(Tree tree) { }
	public void exit_recordingMode(Tree tree) { }
	public void enter_fullPhrase(Tree tree) { }
	public void exit_fullPhrase(Tree tree) { }
	public void enter_unstringStatement(Tree tree) { }
	public void exit_unstringStatement(Tree tree) { }
	public void enter_reportSectionValueClause(Tree tree) { }
	public void exit_reportSectionValueClause(Tree tree) { }
	public void enter_qualifier(Tree tree) { }
	public void exit_qualifier(Tree tree) { }
	public void enter_reportGroupTypeClause(Tree tree) { }
	public void exit_reportGroupTypeClause(Tree tree) { }
	public void enter_integerConstant(Tree tree) { }
	public void exit_integerConstant(Tree tree) { }
	public void enter_evaluateStatement(Tree tree) { }
	public void exit_evaluateStatement(Tree tree) { }
	public void enter_blinkPhrase(Tree tree) { }
	public void exit_blinkPhrase(Tree tree) { }
	public void enter_onSizeError(Tree tree) { }
	public void exit_onSizeError(Tree tree) { }
	public void enter_specialNamesParagraph(Tree tree) { }
	public void exit_specialNamesParagraph(Tree tree) { }
	public void enter_paragraph(Tree tree) { }
	public void exit_paragraph(Tree tree) { }
	public void enter_acceptFromCommandLine(Tree tree) { }
	public void exit_acceptFromCommandLine(Tree tree) { }
	public void enter_execCICSStatement(Tree tree) { }
	public void exit_execCICSStatement(Tree tree) { }
	public void enter_fileControlEntry(Tree tree) { }
	public void exit_fileControlEntry(Tree tree) { }
	public void enter_readyTraceStatement(Tree tree) { }
	public void exit_readyTraceStatement(Tree tree) { }
	public void enter_sectionName(Tree tree) { }
	public void exit_sectionName(Tree tree) { }
	public void enter_conjunction(Tree tree) { }
	public void exit_conjunction(Tree tree) { }
	public void enter_objectParagraph(Tree tree) { }
	public void exit_objectParagraph(Tree tree) { }
	public void enter_defaultClause(Tree tree) { }
	public void exit_defaultClause(Tree tree) { }
	public void enter_gobackStatement(Tree tree) { }
	public void exit_gobackStatement(Tree tree) { }
	public void enter_blankWhenZeroClause(Tree tree) { }
	public void exit_blankWhenZeroClause(Tree tree) { }
	public void enter_alignedClause(Tree tree) { }
	public void exit_alignedClause(Tree tree) { }
	public void enter_tallyingPhrase(Tree tree) { }
	public void exit_tallyingPhrase(Tree tree) { }
	public void enter_lockModeWithClause(Tree tree) { }
	public void exit_lockModeWithClause(Tree tree) { }
	public void enter_compilerDirective(Tree tree) { }
	public void exit_compilerDirective(Tree tree) { }
	public void enter_eventPhrase(Tree tree) { }
	public void exit_eventPhrase(Tree tree) { }
	public void enter_suppressStatement(Tree tree) { }
	public void exit_suppressStatement(Tree tree) { }
	public void enter_atEndOfPage(Tree tree) { }
	public void exit_atEndOfPage(Tree tree) { }
	public void enter_sdFileDescriptionEntry(Tree tree) { }
	public void exit_sdFileDescriptionEntry(Tree tree) { }
	public void enter_examineStatement(Tree tree) { }
	public void exit_examineStatement(Tree tree) { }
	public void enter_paddingClause(Tree tree) { }
	public void exit_paddingClause(Tree tree) { }
	public void enter_programSpecifier(Tree tree) { }
	public void exit_programSpecifier(Tree tree) { }
	public void enter_atom(Tree tree) { }
	public void exit_atom(Tree tree) { }
	public void enter_TOKEN_POSITIVE(Tree tree) { }
	public void exit_TOKEN_POSITIVE(Tree tree) { }
	public void enter_cursorIs(Tree tree) { }
	public void exit_cursorIs(Tree tree) { }
	public void enter_initiateStatement(Tree tree) { }
	public void exit_initiateStatement(Tree tree) { }
	public void enter_execDLIStatement(Tree tree) { }
	public void exit_execDLIStatement(Tree tree) { }
	public void enter_negation(Tree tree) { }
	public void exit_negation(Tree tree) { }
	public void enter_constant(Tree tree) { }
	public void exit_constant(Tree tree) { }
	public void enter_ioSection(Tree tree) { }
	public void exit_ioSection(Tree tree) { }
	public void enter_acceptScreenSizeData(Tree tree) { }
	public void exit_acceptScreenSizeData(Tree tree) { }
	public void enter_subject(Tree tree) { }
	public void exit_subject(Tree tree) { }
	public void enter_signClause(Tree tree) { }
	public void exit_signClause(Tree tree) { }
	public void enter_readStatement(Tree tree) { }
	public void exit_readStatement(Tree tree) { }
	public void enter_TOKEN_IS(Tree tree) { }
	public void exit_TOKEN_IS(Tree tree) { }
	public void enter_integer(Tree tree) { }
	public void exit_integer(Tree tree) { }
	public void enter_ioControlParagraph(Tree tree) { }
	public void exit_ioControlParagraph(Tree tree) { }
	public void enter_execHTMLStatement(Tree tree) { }
	public void exit_execHTMLStatement(Tree tree) { }
	public void enter_enumDefinition(Tree tree) { }
	public void exit_enumDefinition(Tree tree) { }
	public void enter_dtColPos(Tree tree) { }
	public void exit_dtColPos(Tree tree) { }
	public void enter_alphabetName(Tree tree) { }
	public void exit_alphabetName(Tree tree) { }
	public void enter_backgroundPhrase(Tree tree) { }
	public void exit_backgroundPhrase(Tree tree) { }
	public void enter_whenOther(Tree tree) { }
	public void exit_whenOther(Tree tree) { }
	public void enter_dtLineColPositioning(Tree tree) { }
	public void exit_dtLineColPositioning(Tree tree) { }
	public void enter_trailingSignPhrase(Tree tree) { }
	public void exit_trailingSignPhrase(Tree tree) { }
	public void enter_function(Tree tree) { }
	public void exit_function(Tree tree) { }
	public void enter_dtLinePos(Tree tree) { }
	public void exit_dtLinePos(Tree tree) { }
	public void enter_procedureName(Tree tree) { }
	public void exit_procedureName(Tree tree) { }
	public void enter_continuationOfStatement(Tree tree) { }
	public void exit_continuationOfStatement(Tree tree) { }
	public void enter_setEnvironmentVariable(Tree tree) { }
	public void exit_setEnvironmentVariable(Tree tree) { }
	public void enter_acceptMessageCount(Tree tree) { }
	public void exit_acceptMessageCount(Tree tree) { }
	public void enter_subscript(Tree tree) { }
	public void exit_subscript(Tree tree) { }
	public void enter_genericStringDef(Tree tree) { }
	public void exit_genericStringDef(Tree tree) { }
	public void enter_eventStatusIs(Tree tree) { }
	public void exit_eventStatusIs(Tree tree) { }
	public void enter_indexName(Tree tree) { }
	public void exit_indexName(Tree tree) { }
	public void enter_delegateName(Tree tree) { }
	public void exit_delegateName(Tree tree) { }
	public void enter_invokeStatement(Tree tree) { }
	public void exit_invokeStatement(Tree tree) { }
	public void enter_whileKeyModifier(Tree tree) { }
	public void exit_whileKeyModifier(Tree tree) { }
	public void enter_performStatement(Tree tree) { }
	public void exit_performStatement(Tree tree) { }
	public void enter_displayStatement(Tree tree) { }
	public void exit_displayStatement(Tree tree) { }
	public void enter_callPrototypeDefinition(Tree tree) { }
	public void exit_callPrototypeDefinition(Tree tree) { }
	public void enter_convertingPhrase(Tree tree) { }
	public void exit_convertingPhrase(Tree tree) { }
	public void enter_TOKEN_INTO(Tree tree) { }
	public void exit_TOKEN_INTO(Tree tree) { }
	public void enter_standard1AlphabetType(Tree tree) { }
	public void exit_standard1AlphabetType(Tree tree) { }
	public void enter_externalClause(Tree tree) { }
	public void exit_externalClause(Tree tree) { }
	public void enter_condition(Tree tree) { }
	public void exit_condition(Tree tree) { }
	public void enter_procedureDivision(Tree tree) { }
	public void exit_procedureDivision(Tree tree) { }
	public void enter_startStatement(Tree tree) { }
	public void exit_startStatement(Tree tree) { }
	public void enter_recordName(Tree tree) { }
	public void exit_recordName(Tree tree) { }
	public void enter_debugDeclarative(Tree tree) { }
	public void exit_debugDeclarative(Tree tree) { }
	public void enter_workingStorageSection(Tree tree) { }
	public void exit_workingStorageSection(Tree tree) { }
	public void enter_sizePhrase(Tree tree) { }
	public void exit_sizePhrase(Tree tree) { }
	public void enter_literalValue(Tree tree) { }
	public void exit_literalValue(Tree tree) { }
	public void enter_fullClause(Tree tree) { }
	public void exit_fullClause(Tree tree) { }
	public void enter_controlClause(Tree tree) { }
	public void exit_controlClause(Tree tree) { }
	public void enter_moveStatement(Tree tree) { }
	public void exit_moveStatement(Tree tree) { }
	public void enter_recordKeyClause(Tree tree) { }
	public void exit_recordKeyClause(Tree tree) { }
	public void enter_configurationSection(Tree tree) { }
	public void exit_configurationSection(Tree tree) { }
	public void enter_threadLocalClause(Tree tree) { }
	public void exit_threadLocalClause(Tree tree) { }
	public void enter_raiseStatement(Tree tree) { }
	public void exit_raiseStatement(Tree tree) { }
	public void enter_acceptFromDate(Tree tree) { }
	public void exit_acceptFromDate(Tree tree) { }
	public void enter_classIdParagraph(Tree tree) { }
	public void exit_classIdParagraph(Tree tree) { }
	public void enter_chainUsing(Tree tree) { }
	public void exit_chainUsing(Tree tree) { }
	public void enter_iteratorDefinition(Tree tree) { }
	public void exit_iteratorDefinition(Tree tree) { }
	public void enter_times(Tree tree) { }
	public void exit_times(Tree tree) { }
	public void enter_elseBranch(Tree tree) { }
	public void exit_elseBranch(Tree tree) { }
	public void enter_directSubscript(Tree tree) { }
	public void exit_directSubscript(Tree tree) { }
	public void enter_footingClause(Tree tree) { }
	public void exit_footingClause(Tree tree) { }
	public void enter_dependingOn(Tree tree) { }
	public void exit_dependingOn(Tree tree) { }
	public void enter_TOKEN_NOT(Tree tree) { }
	public void exit_TOKEN_NOT(Tree tree) { }
	public void enter_relativeKeyClause(Tree tree) { }
	public void exit_relativeKeyClause(Tree tree) { }
	public void enter_scrollPhrase(Tree tree) { }
	public void exit_scrollPhrase(Tree tree) { }
	public void enter_environmentDivision(Tree tree) { }
	public void exit_environmentDivision(Tree tree) { }
	public void enter_interfaceName(Tree tree) { }
	public void exit_interfaceName(Tree tree) { }
	public void enter_callUsing(Tree tree) { }
	public void exit_callUsing(Tree tree) { }
	public void enter_blinkClause(Tree tree) { }
	public void exit_blinkClause(Tree tree) { }
	public void enter_recordKeyDefinition(Tree tree) { }
	public void exit_recordKeyDefinition(Tree tree) { }
	public void enter_disjunction(Tree tree) { }
	public void exit_disjunction(Tree tree) { }
	public void enter_functionName(Tree tree) { }
	public void exit_functionName(Tree tree) { }
	public void enter_deleteFileStatement(Tree tree) { }
	public void exit_deleteFileStatement(Tree tree) { }
	public void enter_goToStatement(Tree tree) { }
	public void exit_goToStatement(Tree tree) { }
	public void enter_usageOperand(Tree tree) { }
	public void exit_usageOperand(Tree tree) { }
	public void enter_objectComputerParagraph(Tree tree) { }
	public void exit_objectComputerParagraph(Tree tree) { }
	public void enter_interfaceIdParagraph(Tree tree) { }
	public void exit_interfaceIdParagraph(Tree tree) { }
	public void enter_linesAtBottomClause(Tree tree) { }
	public void exit_linesAtBottomClause(Tree tree) { }
	public void enter_xmlGenerateStatement(Tree tree) { }
	public void exit_xmlGenerateStatement(Tree tree) { }
	public void enter_copybookHoldingBehaviour(Tree tree) { }
	public void exit_copybookHoldingBehaviour(Tree tree) { }
	public void enter_eraseClause(Tree tree) { }
	public void exit_eraseClause(Tree tree) { }
	public void enter_notOnEscape(Tree tree) { }
	public void exit_notOnEscape(Tree tree) { }
	public void enter_until(Tree tree) { }
	public void exit_until(Tree tree) { }
	public void enter_callPrototypeIdParagraph(Tree tree) { }
	public void exit_callPrototypeIdParagraph(Tree tree) { }
	public void enter_typedefClause(Tree tree) { }
	public void exit_typedefClause(Tree tree) { }
	public void enter_replacingPhrase(Tree tree) { }
	public void exit_replacingPhrase(Tree tree) { }
	public void enter_fillPhrase(Tree tree) { }
	public void exit_fillPhrase(Tree tree) { }
	public void enter_TOKEN_REPLACING(Tree tree) { }
	public void exit_TOKEN_REPLACING(Tree tree) { }
	public void enter_sourceUnit(Tree tree) { }
	public void exit_sourceUnit(Tree tree) { }
	public void enter_copybook(Tree tree) { }
	public void exit_copybook(Tree tree) { }
	public void enter_acceptFromOther(Tree tree) { }
	public void exit_acceptFromOther(Tree tree) { }
	public void enter_fileName(Tree tree) { }
	public void exit_fileName(Tree tree) { }
	public void enter_compilationGroup(Tree tree) { }
	public void exit_compilationGroup(Tree tree) { }
	public void enter_metadata(Tree tree) { }
	public void exit_metadata(Tree tree) { }
	public void enter_cobolDevice(Tree tree) { }
	public void exit_cobolDevice(Tree tree) { }
	public void enter_defaultRoundedClause(Tree tree) { }
	public void exit_defaultRoundedClause(Tree tree) { }
	public void enter_screenName(Tree tree) { }
	public void exit_screenName(Tree tree) { }
	public void enter_requiredPhrase(Tree tree) { }
	public void exit_requiredPhrase(Tree tree) { }
	public void enter_bitwiseExclusiveDisjunction(Tree tree) { }
	public void exit_bitwiseExclusiveDisjunction(Tree tree) { }
	public void enter_execTextDataStatement(Tree tree) { }
	public void exit_execTextDataStatement(Tree tree) { }
	public void enter_typeNameTypeClause(Tree tree) { }
	public void exit_typeNameTypeClause(Tree tree) { }
	public void enter_relativeSubscript(Tree tree) { }
	public void exit_relativeSubscript(Tree tree) { }
	public void enter_globalClause(Tree tree) { }
	public void exit_globalClause(Tree tree) { }
	public void enter_nextSentenceStatement(Tree tree) { }
	public void exit_nextSentenceStatement(Tree tree) { }
	public void enter_occursClause(Tree tree) { }
	public void exit_occursClause(Tree tree) { }
	public void enter_replacingAllLeadingFirstOrTrailingPhrase(Tree tree) { }
	public void exit_replacingAllLeadingFirstOrTrailingPhrase(Tree tree) { }
	public void enter_numericLiteral(Tree tree) { }
	public void exit_numericLiteral(Tree tree) { }
	public void enter_classDefinition(Tree tree) { }
	public void exit_classDefinition(Tree tree) { }
	public void enter_initializeStatement(Tree tree) { }
	public void exit_initializeStatement(Tree tree) { }
	public void enter_autoPhrase(Tree tree) { }
	public void exit_autoPhrase(Tree tree) { }
	public void enter_displayTerminalFormat(Tree tree) { }
	public void exit_displayTerminalFormat(Tree tree) { }
	public void enter_notOnException(Tree tree) { }
	public void exit_notOnException(Tree tree) { }
	public void enter_classIs(Tree tree) { }
	public void exit_classIs(Tree tree) { }
	public void enter_atEnd(Tree tree) { }
	public void exit_atEnd(Tree tree) { }
	public void enter_invalidKey(Tree tree) { }
	public void exit_invalidKey(Tree tree) { }
	public void enter_assignClause(Tree tree) { }
	public void exit_assignClause(Tree tree) { }
	public void enter_dataValue(Tree tree) { }
	public void exit_dataValue(Tree tree) { }
	public void enter_propertyValue(Tree tree) { }
	public void exit_propertyValue(Tree tree) { }
	public void enter_exceedsOp(Tree tree) { }
	public void exit_exceedsOp(Tree tree) { }
	public void enter_functionPrototype(Tree tree) { }
	public void exit_functionPrototype(Tree tree) { }
	public void enter_sourceClause(Tree tree) { }
	public void exit_sourceClause(Tree tree) { }
	public void enter_alternateRecordKeyClause(Tree tree) { }
	public void exit_alternateRecordKeyClause(Tree tree) { }
	public void enter_displayStatement__(Tree tree) { }
	public void exit_displayStatement__(Tree tree) { }
	public void enter_consoleIsCRT(Tree tree) { }
	public void exit_consoleIsCRT(Tree tree) { }
	public void enter_valuetypeName(Tree tree) { }
	public void exit_valuetypeName(Tree tree) { }
	public void enter_sizeModifier(Tree tree) { }
	public void exit_sizeModifier(Tree tree) { }
	public void enter_recordContainsClause(Tree tree) { }
	public void exit_recordContainsClause(Tree tree) { }
	public void enter_acceptFromMnemonic(Tree tree) { }
	public void exit_acceptFromMnemonic(Tree tree) { }
	public void enter_linesAtTopClause(Tree tree) { }
	public void exit_linesAtTopClause(Tree tree) { }
	public void enter_multiplication_format2(Tree tree) { }
	public void exit_multiplication_format2(Tree tree) { }
	public void enter_multiplication_format1(Tree tree) { }
	public void exit_multiplication_format1(Tree tree) { }
	public void enter_ioSectionBody(Tree tree) { }
	public void exit_ioSectionBody(Tree tree) { }
	public void enter_valueTypeDefinition(Tree tree) { }
	public void exit_valueTypeDefinition(Tree tree) { }
	public void enter_literalRange(Tree tree) { }
	public void exit_literalRange(Tree tree) { }
	public void enter_returnStatement(Tree tree) { }
	public void exit_returnStatement(Tree tree) { }
	public void enter_arithmeticExpression(Tree tree) { }
	public void exit_arithmeticExpression(Tree tree) { }
	public void enter_relop(Tree tree) { }
	public void exit_relop(Tree tree) { }
	public void enter_uponClause(Tree tree) { }
	public void exit_uponClause(Tree tree) { }
	public void enter_declarativeSection(Tree tree) { }
	public void exit_declarativeSection(Tree tree) { }
	public void enter_abbreviatedNegation(Tree tree) { }
	public void exit_abbreviatedNegation(Tree tree) { }
	public void enter_literal(Tree tree) { }
	public void exit_literal(Tree tree) { }
	public void enter_paragraphName(Tree tree) { }
	public void exit_paragraphName(Tree tree) { }
	public void enter_errorDeclarative(Tree tree) { }
	public void exit_errorDeclarative(Tree tree) { }
	public void enter_deleteStatement(Tree tree) { }
	public void exit_deleteStatement(Tree tree) { }
	public void enter_notAtEndOfPage(Tree tree) { }
	public void exit_notAtEndOfPage(Tree tree) { }
	public void enter_varying(Tree tree) { }
	public void exit_varying(Tree tree) { }
	public void enter_constantEntry_level01(Tree tree) { }
	public void exit_constantEntry_level01(Tree tree) { }
	public void enter_foregroundColorClause(Tree tree) { }
	public void exit_foregroundColorClause(Tree tree) { }
	public void enter_repositoryParagraph(Tree tree) { }
	public void exit_repositoryParagraph(Tree tree) { }
	public void enter_constantValueClause(Tree tree) { }
	public void exit_constantValueClause(Tree tree) { }
	public void enter_levelNumber(Tree tree) { }
	public void exit_levelNumber(Tree tree) { }
	public void enter_gridPhrase(Tree tree) { }
	public void exit_gridPhrase(Tree tree) { }
	public void enter_alphabetType(Tree tree) { }
	public void exit_alphabetType(Tree tree) { }
	public void enter_sectionStart(Tree tree) { }
	public void exit_sectionStart(Tree tree) { }
	public void enter_expression(Tree tree) { }
	public void exit_expression(Tree tree) { }
	public void enter_classClause(Tree tree) { }
	public void exit_classClause(Tree tree) { }
	public void enter_withNoAdvancing(Tree tree) { }
	public void exit_withNoAdvancing(Tree tree) { }
	public void enter_timePhrase(Tree tree) { }
	public void exit_timePhrase(Tree tree) { }
	public void enter_typeSpecifier(Tree tree) { }
	public void exit_typeSpecifier(Tree tree) { }
	public void enter_modeIsBlockPhrase(Tree tree) { }
	public void exit_modeIsBlockPhrase(Tree tree) { }
	public void enter_asciiAlphabetType(Tree tree) { }
	public void exit_asciiAlphabetType(Tree tree) { }
	public void enter_acceptStatement(Tree tree) { }
	public void exit_acceptStatement(Tree tree) { }
	public void enter_division_format3(Tree tree) { }
	public void exit_division_format3(Tree tree) { }
	public void enter_division_format1(Tree tree) { }
	public void exit_division_format1(Tree tree) { }
	public void enter_division_format2(Tree tree) { }
	public void exit_division_format2(Tree tree) { }
	public void enter_interfaceDefinition(Tree tree) { }
	public void exit_interfaceDefinition(Tree tree) { }
	public void enter_propertyName(Tree tree) { }
	public void exit_propertyName(Tree tree) { }
	public void enter_mergeStatement(Tree tree) { }
	public void exit_mergeStatement(Tree tree) { }
	public void enter_withData(Tree tree) { }
	public void exit_withData(Tree tree) { }
	public void enter_TOKEN_TO(Tree tree) { }
	public void exit_TOKEN_TO(Tree tree) { }
	public void enter_recordDescriptionEntry(Tree tree) { }
	public void exit_recordDescriptionEntry(Tree tree) { }
	public void enter_xmlSchemaIs(Tree tree) { }
	public void exit_xmlSchemaIs(Tree tree) { }
	public void enter_TOKEN_GIVING(Tree tree) { }
	public void exit_TOKEN_GIVING(Tree tree) { }
	public void enter_justified(Tree tree) { }
	public void exit_justified(Tree tree) { }
	public void enter_TOKEN_LENGTH(Tree tree) { }
	public void exit_TOKEN_LENGTH(Tree tree) { }
	public void enter_communicationSection(Tree tree) { }
	public void exit_communicationSection(Tree tree) { }
	public void enter_codeNameAlphabetType(Tree tree) { }
	public void exit_codeNameAlphabetType(Tree tree) { }
	public void enter_zero(Tree tree) { }
	public void exit_zero(Tree tree) { }
	public void enter_onEscape(Tree tree) { }
	public void exit_onEscape(Tree tree) { }
	public void enter_conditionNameCondition(Tree tree) { }
	public void exit_conditionNameCondition(Tree tree) { }
	public void enter_underlineClause(Tree tree) { }
	public void exit_underlineClause(Tree tree) { }
	public void enter_autoClause(Tree tree) { }
	public void exit_autoClause(Tree tree) { }
	public void enter_lessThanOp(Tree tree) { }
	public void exit_lessThanOp(Tree tree) { }
	public void enter_screenFromClause(Tree tree) { }
	public void exit_screenFromClause(Tree tree) { }
	public void enter_offPhrase(Tree tree) { }
	public void exit_offPhrase(Tree tree) { }
	public void enter_fileStatusClause(Tree tree) { }
	public void exit_fileStatusClause(Tree tree) { }
	public void enter_formatClause(Tree tree) { }
	public void exit_formatClause(Tree tree) { }
	public void enter_closeStatement(Tree tree) { }
	public void exit_closeStatement(Tree tree) { }
	public void enter_beepPhrase(Tree tree) { }
	public void exit_beepPhrase(Tree tree) { }
	public void enter_delegateDefinition(Tree tree) { }
	public void exit_delegateDefinition(Tree tree) { }
	public void enter_byteLengthPhrase(Tree tree) { }
	public void exit_byteLengthPhrase(Tree tree) { }
	public void enter_exhibitStatement(Tree tree) { }
	public void exit_exhibitStatement(Tree tree) { }
	public void enter_dataDivision(Tree tree) { }
	public void exit_dataDivision(Tree tree) { }
	public void enter_TOKEN_FALSE(Tree tree) { }
	public void exit_TOKEN_FALSE(Tree tree) { }
	public void enter_addStatement(Tree tree) { }
	public void exit_addStatement(Tree tree) { }
	public void enter_standard2AlphabetType(Tree tree) { }
	public void exit_standard2AlphabetType(Tree tree) { }
	public void enter_explicitAlphabetType(Tree tree) { }
	public void exit_explicitAlphabetType(Tree tree) { }
	public void enter_name(Tree tree) { }
	public void exit_name(Tree tree) { }
	public void enter_blockContainsClause(Tree tree) { }
	public void exit_blockContainsClause(Tree tree) { }
	public void enter_inspectStatement(Tree tree) { }
	public void exit_inspectStatement(Tree tree) { }
	public void enter_TOKEN_AFTER(Tree tree) { }
	public void exit_TOKEN_AFTER(Tree tree) { }
	public void enter_objectSectionBody(Tree tree) { }
	public void exit_objectSectionBody(Tree tree) { }
	public void enter_copybookHoldingData(Tree tree) { }
	public void exit_copybookHoldingData(Tree tree) { }
	public void enter_entryConventionClause(Tree tree) { }
	public void exit_entryConventionClause(Tree tree) { }
	public void enter_linageClause(Tree tree) { }
	public void exit_linageClause(Tree tree) { }
	public void enter_reportName(Tree tree) { }
	public void exit_reportName(Tree tree) { }
	public void enter_replacingCharactersPhrase(Tree tree) { }
	public void exit_replacingCharactersPhrase(Tree tree) { }
	public void enter_exitStatement(Tree tree) { }
	public void exit_exitStatement(Tree tree) { }
	public void enter_unequalToOp(Tree tree) { }
	public void exit_unequalToOp(Tree tree) { }
	public void enter_qualifiedDataName(Tree tree) { }
	public void exit_qualifiedDataName(Tree tree) { }
	public void enter_codeSetClause(Tree tree) { }
	public void exit_codeSetClause(Tree tree) { }
	public void enter_programPrototype(Tree tree) { }
	public void exit_programPrototype(Tree tree) { }
	public void enter_updatePhrase(Tree tree) { }
	public void exit_updatePhrase(Tree tree) { }
	public void enter_TOKEN_OR(Tree tree) { }
	public void exit_TOKEN_OR(Tree tree) { }
	public void enter_allocateStatement(Tree tree) { }
	public void exit_allocateStatement(Tree tree) { }
	public void enter_varyingClause(Tree tree) { }
	public void exit_varyingClause(Tree tree) { }
	public void enter_omittedArgumentCondition(Tree tree) { }
	public void exit_omittedArgumentCondition(Tree tree) { }
	public void enter_requiredClause(Tree tree) { }
	public void exit_requiredClause(Tree tree) { }
	public void enter_callGivingOrReturning(Tree tree) { }
	public void exit_callGivingOrReturning(Tree tree) { }
	public void enter_environmentDivisionBody(Tree tree) { }
	public void exit_environmentDivisionBody(Tree tree) { }
	public void enter_sendStatement(Tree tree) { }
	public void exit_sendStatement(Tree tree) { }
	public void enter_statement(Tree tree) { }
	public void exit_statement(Tree tree) { }
	public void enter_attributeName(Tree tree) { }
	public void exit_attributeName(Tree tree) { }
	public void enter_factor(Tree tree) { }
	public void exit_factor(Tree tree) { }
	public void enter_figurativeConstant(Tree tree) { }
	public void exit_figurativeConstant(Tree tree) { }
	public void enter_TOKEN_FROM(Tree tree) { }
	public void exit_TOKEN_FROM(Tree tree) { }
	public void enter_valueOf(Tree tree) { }
	public void exit_valueOf(Tree tree) { }
	public void enter_fileControlParagraph(Tree tree) { }
	public void exit_fileControlParagraph(Tree tree) { }
	public void enter_readLockClause(Tree tree) { }
	public void exit_readLockClause(Tree tree) { }
	public void enter_assignUsingClause(Tree tree) { }
	public void exit_assignUsingClause(Tree tree) { }
	public void enter_ifStatement(Tree tree) { }
	public void exit_ifStatement(Tree tree) { }
	public void enter_pictureLocaleClause(Tree tree) { }
	public void exit_pictureLocaleClause(Tree tree) { }
	public void enter_identifier_format6(Tree tree) { }
	public void exit_identifier_format6(Tree tree) { }
	public void enter_organizationClause(Tree tree) { }
	public void exit_organizationClause(Tree tree) { }
	public void enter_diskClause(Tree tree) { }
	public void exit_diskClause(Tree tree) { }
	public void enter_decimalIsComma(Tree tree) { }
	public void exit_decimalIsComma(Tree tree) { }
	public void enter_reportGroupUsageClause(Tree tree) { }
	public void exit_reportGroupUsageClause(Tree tree) { }
	public void enter_endOfStatementMarker(Tree tree) { }
	public void exit_endOfStatementMarker(Tree tree) { }
	public void enter_identifier_format1(Tree tree) { }
	public void exit_identifier_format1(Tree tree) { }
	public void enter_identifier_format2(Tree tree) { }
	public void exit_identifier_format2(Tree tree) { }
	public void enter_base(Tree tree) { }
	public void exit_base(Tree tree) { }
	public void enter_programDefinition(Tree tree) { }
	public void exit_programDefinition(Tree tree) { }
	public void enter_screenDescriptionEntry(Tree tree) { }
	public void exit_screenDescriptionEntry(Tree tree) { }
	public void enter_communicationDescriptionEntry_format2(Tree tree) { }
	public void exit_communicationDescriptionEntry_format2(Tree tree) { }
	public void enter_sameAsClause(Tree tree) { }
	public void exit_sameAsClause(Tree tree) { }
	public void enter_communicationDescriptionEntry_format3(Tree tree) { }
	public void exit_communicationDescriptionEntry_format3(Tree tree) { }
	public void enter_objectSection(Tree tree) { }
	public void exit_objectSection(Tree tree) { }
	public void enter_dataRecords(Tree tree) { }
	public void exit_dataRecords(Tree tree) { }
	public void enter_relationObject(Tree tree) { }
	public void exit_relationObject(Tree tree) { }
	public void enter_arithmeticClause(Tree tree) { }
	public void exit_arithmeticClause(Tree tree) { }
	public void enter_methodDefinition(Tree tree) { }
	public void exit_methodDefinition(Tree tree) { }
	public void enter_fileDescriptionEntry(Tree tree) { }
	public void exit_fileDescriptionEntry(Tree tree) { }
	public void enter_when(Tree tree) { }
	public void exit_when(Tree tree) { }
	public void enter_communicationDescriptionEntry_format1(Tree tree) { }
	public void exit_communicationDescriptionEntry_format1(Tree tree) { }
	public void enter_capitalizationPhrase(Tree tree) { }
	public void exit_capitalizationPhrase(Tree tree) { }
	public void enter_screenSection(Tree tree) { }
	public void exit_screenSection(Tree tree) { }
	public void enter_optionsParagraph(Tree tree) { }
	public void exit_optionsParagraph(Tree tree) { }
	public void enter_moreArithmeticOp(Tree tree) { }
	public void exit_moreArithmeticOp(Tree tree) { }
	public void enter_programName(Tree tree) { }
	public void exit_programName(Tree tree) { }
	public void enter_environmentName(Tree tree) { }
	public void exit_environmentName(Tree tree) { }
	public void enter_alterStatement(Tree tree) { }
	public void exit_alterStatement(Tree tree) { }
	public void enter_stringStatement(Tree tree) { }
	public void exit_stringStatement(Tree tree) { }
	public void enter_identifier(Tree tree) { }
	public void exit_identifier(Tree tree) { }
	public void enter_referenceModifier(Tree tree) { }
	public void exit_referenceModifier(Tree tree) { }
	public void enter_threadLocalStorageSection(Tree tree) { }
	public void exit_threadLocalStorageSection(Tree tree) { }
	public void enter_screenControlIs(Tree tree) { }
	public void exit_screenControlIs(Tree tree) { }
	public void enter_readWithClause(Tree tree) { }
	public void exit_readWithClause(Tree tree) { }
	public void enter_specialNameStatement(Tree tree) { }
	public void exit_specialNameStatement(Tree tree) { }
	public void enter_recordClause(Tree tree) { }
	public void exit_recordClause(Tree tree) { }
	public void enter_replacingInitClause(Tree tree) { }
	public void exit_replacingInitClause(Tree tree) { }
	public void enter_acceptScreenFormat(Tree tree) { }
	public void exit_acceptScreenFormat(Tree tree) { }
	public void enter_mnemonicName(Tree tree) { }
	public void exit_mnemonicName(Tree tree) { }
	public void enter_classAttributesParagraph(Tree tree) { }
	public void exit_classAttributesParagraph(Tree tree) { }
	public void enter_reportDescriptionEntry(Tree tree) { }
	public void exit_reportDescriptionEntry(Tree tree) { }
	public void enter_recordDelimiterClause(Tree tree) { }
	public void exit_recordDelimiterClause(Tree tree) { }
	public void enter_openStatement(Tree tree) { }
	public void exit_openStatement(Tree tree) { }
	public void enter_currencySignIs(Tree tree) { }
	public void exit_currencySignIs(Tree tree) { }
	public void enter_threadPointer(Tree tree) { }
	public void exit_threadPointer(Tree tree) { }
	public void enter_constraintsParagraph(Tree tree) { }
	public void exit_constraintsParagraph(Tree tree) { }
	public void enter_notOnOverflow(Tree tree) { }
	public void exit_notOnOverflow(Tree tree) { }
	public void enter_tabPhrase(Tree tree) { }
	public void exit_tabPhrase(Tree tree) { }
	public void enter_typeName(Tree tree) { }
	public void exit_typeName(Tree tree) { }
	public void enter_className(Tree tree) { }
	public void exit_className(Tree tree) { }
	public void enter_onException(Tree tree) { }
	public void exit_onException(Tree tree) { }
	public void enter_divisionStart(Tree tree) { }
	public void exit_divisionStart(Tree tree) { }
	public void enter_segmentNumber(Tree tree) { }
	public void exit_segmentNumber(Tree tree) { }
	public void enter_concatenatedLiteral(Tree tree) { }
	public void exit_concatenatedLiteral(Tree tree) { }
	public void enter_securePhrase(Tree tree) { }
	public void exit_securePhrase(Tree tree) { }
	public void enter_fileSection(Tree tree) { }
	public void exit_fileSection(Tree tree) { }
	public void enter_computerName(Tree tree) { }
	public void exit_computerName(Tree tree) { }
	public void enter_factoryDefinition(Tree tree) { }
	public void exit_factoryDefinition(Tree tree) { }
	public void enter_cancelStatement(Tree tree) { }
	public void exit_cancelStatement(Tree tree) { }
	public void enter_procedureDivisionHeader(Tree tree) { }
	public void exit_procedureDivisionHeader(Tree tree) { }
	public void enter_crtStatusIs(Tree tree) { }
	public void exit_crtStatusIs(Tree tree) { }
	public void enter_passwordClause(Tree tree) { }
	public void exit_passwordClause(Tree tree) { }
	public void enter_basedClause(Tree tree) { }
	public void exit_basedClause(Tree tree) { }
	public void enter_operatorDefinition(Tree tree) { }
	public void exit_operatorDefinition(Tree tree) { }
	public void enter_generateStatement(Tree tree) { }
	public void exit_generateStatement(Tree tree) { }
	public void enter_configurationSectionBody(Tree tree) { }
	public void exit_configurationSectionBody(Tree tree) { }
	public void enter_programPrototypeIdParagraph(Tree tree) { }
	public void exit_programPrototypeIdParagraph(Tree tree) { }
	public void enter_abbreviatedDisjunction(Tree tree) { }
	public void exit_abbreviatedDisjunction(Tree tree) { }
	public void enter_TOKEN_ELSE(Tree tree) { }
	public void exit_TOKEN_ELSE(Tree tree) { }
	public void enter_reportSection(Tree tree) { }
	public void exit_reportSection(Tree tree) { }
	public void enter_resetTraceStatement(Tree tree) { }
	public void exit_resetTraceStatement(Tree tree) { }
	public void enter_delegateIdParagraph(Tree tree) { }
	public void exit_delegateIdParagraph(Tree tree) { }
	public void enter_propertySpecifier(Tree tree) { }
	public void exit_propertySpecifier(Tree tree) { }
	public void enter_anyLengthClause(Tree tree) { }
	public void exit_anyLengthClause(Tree tree) { }
	public void enter_symbolicChars(Tree tree) { }
	public void exit_symbolicChars(Tree tree) { }
	public void enter_iteratorName(Tree tree) { }
	public void exit_iteratorName(Tree tree) { }
	public void enter_multiplyStatement(Tree tree) { }
	public void exit_multiplyStatement(Tree tree) { }
	public void enter_linkageSection(Tree tree) { }
	public void exit_linkageSection(Tree tree) { }
	public void enter_constantEntry_level78(Tree tree) { }
	public void exit_constantEntry_level78(Tree tree) { }
	public void enter_intermediateRoundingClause(Tree tree) { }
	public void exit_intermediateRoundingClause(Tree tree) { }
	public void enter_screenToClause(Tree tree) { }
	public void exit_screenToClause(Tree tree) { }
	public void enter_lengthPhrase(Tree tree) { }
	public void exit_lengthPhrase(Tree tree) { }
	public void enter_chainStatement(Tree tree) { }
	public void exit_chainStatement(Tree tree) { }
	public void enter_presentWhenClause(Tree tree) { }
	public void exit_presentWhenClause(Tree tree) { }
	public void enter_highPhrase(Tree tree) { }
	public void exit_highPhrase(Tree tree) { }
	public void enter_reversePhrase(Tree tree) { }
	public void exit_reversePhrase(Tree tree) { }
	public void enter_dataReference(Tree tree) { }
	public void exit_dataReference(Tree tree) { }
	public void enter_argument(Tree tree) { }
	public void exit_argument(Tree tree) { }
	public void enter_secureClause(Tree tree) { }
	public void exit_secureClause(Tree tree) { }
	public void enter_greaterThanOp(Tree tree) { }
	public void exit_greaterThanOp(Tree tree) { }
	public void enter_section(Tree tree) { }
	public void exit_section(Tree tree) { }
	public void enter_conditionName(Tree tree) { }
	public void exit_conditionName(Tree tree) { }
	public void enter_serviceStatement(Tree tree) { }
	public void exit_serviceStatement(Tree tree) { }
	public void enter_dataAddressIdentifier(Tree tree) { }
	public void exit_dataAddressIdentifier(Tree tree) { }
	public void enter_operatorIdParagraph(Tree tree) { }
	public void exit_operatorIdParagraph(Tree tree) { }
	public void enter_notInvalidKey(Tree tree) { }
	public void exit_notInvalidKey(Tree tree) { }
	public void enter_space(Tree tree) { }
	public void exit_space(Tree tree) { }
	public void enter_nestedStatements(Tree tree) { }
	public void exit_nestedStatements(Tree tree) { }
	public void enter_divideStatement(Tree tree) { }
	public void exit_divideStatement(Tree tree) { }
	public void enter_bitwiseConjunction(Tree tree) { }
	public void exit_bitwiseConjunction(Tree tree) { }
	public void enter_propertyClause(Tree tree) { }
	public void exit_propertyClause(Tree tree) { }
	public void enter_valueOfFileId(Tree tree) { }
	public void exit_valueOfFileId(Tree tree) { }
	public void enter_groupUsageClause(Tree tree) { }
	public void exit_groupUsageClause(Tree tree) { }
	public void enter_qualifiedReportCounter(Tree tree) { }
	public void exit_qualifiedReportCounter(Tree tree) { }
	public void enter_cicsStatement(Tree tree) { }
	public void exit_cicsStatement(Tree tree) { }
	public void enter_classControlParagraph(Tree tree) { }
	public void exit_classControlParagraph(Tree tree) { }
	public void enter_lineClause(Tree tree) { }
	public void exit_lineClause(Tree tree) { }
	public void enter_localStorageSection(Tree tree) { }
	public void exit_localStorageSection(Tree tree) { }
	public void enter_reportGroupDescriptionEntry(Tree tree) { }
	public void exit_reportGroupDescriptionEntry(Tree tree) { }
	public void enter_typedefName(Tree tree) { }
	public void exit_typedefName(Tree tree) { }
	public void enter_classSpecifier(Tree tree) { }
	public void exit_classSpecifier(Tree tree) { }
	public void enter_relationCondition(Tree tree) { }
	public void exit_relationCondition(Tree tree) { }
	public void enter_repeatedPhrase(Tree tree) { }
	public void exit_repeatedPhrase(Tree tree) { }
	public void enter_invalidClause(Tree tree) { }
	public void exit_invalidClause(Tree tree) { }
	public void enter_onOverflow(Tree tree) { }
	public void exit_onOverflow(Tree tree) { }
	public void enter_receiveStatement(Tree tree) { }
	public void exit_receiveStatement(Tree tree) { }
	public void enter_instanceDefinition(Tree tree) { }
	public void exit_instanceDefinition(Tree tree) { }
	public void enter_synchronizedClause(Tree tree) { }
	public void exit_synchronizedClause(Tree tree) { }
	public void enter_objectStorageSection(Tree tree) { }
	public void exit_objectStorageSection(Tree tree) { }
	public void enter_TOKEN_COMMENT(Tree tree) { }
	public void exit_TOKEN_COMMENT(Tree tree) { }
	public void enter_onStatement(Tree tree) { }
	public void exit_onStatement(Tree tree) { }
	public void enter_delegateSpecifier(Tree tree) { }
	public void exit_delegateSpecifier(Tree tree) { }
	public void enter_pictureClause(Tree tree) { }
	public void exit_pictureClause(Tree tree) { }
	public void enter_disableStatement(Tree tree) { }
	public void exit_disableStatement(Tree tree) { }
	public void enter_signCondition(Tree tree) { }
	public void exit_signCondition(Tree tree) { }
	public void enter_cicsValue(Tree tree) { }
	public void exit_cicsValue(Tree tree) { }
	public void enter_enumName(Tree tree) { }
	public void exit_enumName(Tree tree) { }
	public void enter_compilerStatement(Tree tree) { }
	public void exit_compilerStatement(Tree tree) { }
	public void enter_classType(Tree tree) { }
	public void exit_classType(Tree tree) { }
	public void enter_validateStatusClause(Tree tree) { }
	public void exit_validateStatusClause(Tree tree) { }
	public void enter_lessOrEqualOp(Tree tree) { }
	public void exit_lessOrEqualOp(Tree tree) { }
	public void enter_xmlParseStatement(Tree tree) { }
	public void exit_xmlParseStatement(Tree tree) { }
	public void enter_numeric(Tree tree) { }
	public void exit_numeric(Tree tree) { }
	public void enter_dataName(Tree tree) { }
	public void exit_dataName(Tree tree) { }
	public void enter_selectWhenClause(Tree tree) { }
	public void exit_selectWhenClause(Tree tree) { }
	public void enter_screenUsingClause(Tree tree) { }
	public void exit_screenUsingClause(Tree tree) { }
	public void enter_freeStatement(Tree tree) { }
	public void exit_freeStatement(Tree tree) { }
	public void enter_replacementTarget(Tree tree) { }
	public void exit_replacementTarget(Tree tree) { }
	public void enter_lowPhrase(Tree tree) { }
	public void exit_lowPhrase(Tree tree) { }
	public void enter_labelRecords(Tree tree) { }
	public void exit_labelRecords(Tree tree) { }
	public void enter_rewriteStatement(Tree tree) { }
	public void exit_rewriteStatement(Tree tree) { }
	public void enter_value(Tree tree) { }
	public void exit_value(Tree tree) { }
	public void enter_TOKEN_EQUALS(Tree tree) { }
	public void exit_TOKEN_EQUALS(Tree tree) { }
	public void enter_displayDeviceFormat(Tree tree) { }
	public void exit_displayDeviceFormat(Tree tree) { }
	public void enter_releaseStatement(Tree tree) { }
	public void exit_releaseStatement(Tree tree) { }
	public void enter_copyOperandName(Tree tree) { }
	public void exit_copyOperandName(Tree tree) { }
	public void enter_bellClause(Tree tree) { }
	public void exit_bellClause(Tree tree) { }
	public void enter_methodName(Tree tree) { }
	public void exit_methodName(Tree tree) { }
	public void enter_nativeAlphabetType(Tree tree) { }
	public void exit_nativeAlphabetType(Tree tree) { }
	public void enter_TOKEN_EQUALSIGN(Tree tree) { }
	public void exit_TOKEN_EQUALSIGN(Tree tree) { }
	public void enter_withDebuggingMode(Tree tree) { }
	public void exit_withDebuggingMode(Tree tree) { }
	public void enter_ebcdicAlphabetType(Tree tree) { }
	public void exit_ebcdicAlphabetType(Tree tree) { }
	public void enter_alphanumericConstant(Tree tree) { }
	public void exit_alphanumericConstant(Tree tree) { }
	public void enter_reportClause(Tree tree) { }
	public void exit_reportClause(Tree tree) { }
	public void enter_parenthesizedCondition(Tree tree) { }
	public void exit_parenthesizedCondition(Tree tree) { }
	public void enter_reserveClause(Tree tree) { }
	public void exit_reserveClause(Tree tree) { }
	public void enter_continueStatement(Tree tree) { }
	public void exit_continueStatement(Tree tree) { }
	public void enter_compilerIfStatement(Tree tree) { }
	public void exit_compilerIfStatement(Tree tree) { }
	public void enter_enumSpecifier(Tree tree) { }
	public void exit_enumSpecifier(Tree tree) { }
	public void enter_blankWhenZero(Tree tree) { }
	public void exit_blankWhenZero(Tree tree) { }
	public void enter_somethingFollowingAStatement(Tree tree) { }
	public void exit_somethingFollowingAStatement(Tree tree) { }
   
}
