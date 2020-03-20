/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2020 DBeaver Corp and others
 * Copyright (C) 2011-2012 Eugene Fradkin (eugene.fradkin@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.core;

import org.eclipse.osgi.util.NLS;

public class CoreMessages extends NLS {
	public static final String BUNDLE_NAME = "org.jkiss.dbeaver.core.CoreResources"; //$NON-NLS-1$

	public static String actions_menu_about;
	public static String actions_menu_check_update;
	public static String actions_menu_database;
	public static String actions_menu_edit;
	public static String actions_menu_edit_ContentFormat;
	public static String actions_menu_file;
	public static String actions_menu_help;
	public static String actions_menu_navigate;
	public static String actions_menu_window;
	public static String actions_menu_window_showView;
	public static String action_menu_showKeyAssist;
	public static String action_menu_installNewSoftware;
	public static String action_menu_installInfo;
	public static String action_menu_enterpriseEdition;
	public static String action_menu_marketplace_extensions;

	public static String action_menu_transaction_manualcommit_name;
	public static String action_menu_transaction_autocommit_name;
	public static String action_menu_transaction_manualcommit_description;
	public static String action_menu_transaction_autocommit_description;
	public static String action_menu_transaction_smart_auto_commit;
	public static String action_menu_transaction_smart_auto_commit_tip;
	public static String action_menu_transaction_smart_auto_commit_recover;
	public static String action_menu_transaction_smart_auto_commit_recover_tip;
	public static String action_menu_tools_find_in_navigator;

	public static String action_menu_transactionMonitor_totalStatement;
	public static String action_menu_transactionMonitor_modifyStatement;
	public static String action_menu_transactionMonitor_autocommitMode;
	public static String action_menu_transactionMonitor_uptime;
	public static String action_menu_transactionMonitor_notConnected;

	public static String actions_navigator_bookmark_error_message;
	public static String actions_navigator_bookmark_error_title;
	public static String actions_navigator_bookmark_title;

    public static String common_error_sql;

    public static String confirm_exit_title;
	public static String confirm_exit_message;
	public static String confirm_exit_toggleMessage;

	public static String confirm_disconnect_txn_title;
	public static String confirm_disconnect_txn_message;
	public static String confirm_disconnect_txn_toggleMessage;

	public static String confirm_driver_download_title;
	public static String confirm_driver_download_message;
	public static String confirm_driver_download_toggleMessage;

	public static String confirm_driver_download_manual_title;
	public static String confirm_driver_download_manual_message;
	public static String confirm_driver_download_manual_toggleMessage;

    public static String confirm_version_check_title;
    public static String confirm_version_check_message;
    public static String confirm_version_check_toggleMessage;

	public static String controls_driver_tree_column_connections;
	public static String controls_driver_tree_column_name;
	public static String controls_itemlist_action_copy;

	public static String model_navigator__connections;
	public static String model_navigator_Connection;
	public static String model_navigator_Connections;

	public static String dialog_about_font;
	public static String dialog_about_label_version;
	public static String dialog_about_title;

	public static String dialog_connection_button_test;
	public static String dialog_connection_events_checkbox_show_process;
	public static String dialog_connection_events_checkbox_terminate_at_disconnect;
	public static String dialog_connection_events_checkbox_wait_finish;
	public static String dialog_connection_events_checkbox_wait_finish_timeout;

	public static String dialog_connection_events_label_command;
	public static String dialog_connection_events_label_event;
	public static String dialog_connection_events_title;
	public static String dialog_connection_message;
	public static String dialog_connection_description;
	public static String dialog_connection_wizard_final_button_test;
	public static String dialog_connection_wizard_final_button_events;
	public static String dialog_connection_wizard_final_checkbox_filter_catalogs;
	public static String dialog_connection_wizard_final_checkbox_filter_schemas;
    public static String dialog_connection_wizard_final_checkbox_auto_commit;
	public static String dialog_connection_wizard_final_checkbox_show_system_objects;
	public static String dialog_connection_wizard_final_checkbox_show_util_objects;
    public static String dialog_connection_wizard_final_checkbox_connection_readonly;
	public static String dialog_connection_wizard_final_default_new_connection_name;
	public static String dialog_connection_wizard_final_description;
	public static String dialog_connection_wizard_final_group_filters;
	public static String dialog_connection_wizard_final_group_security;
    public static String dialog_connection_wizard_final_group_misc;
	public static String dialog_connection_wizard_final_header;
	public static String dialog_connection_wizard_final_label_connection_name;
	public static String dialog_connection_wizard_final_filter_catalogs;
	public static String dialog_connection_wizard_final_filter_schemas_users;
	public static String dialog_connection_wizard_final_filter_tables;
	public static String dialog_connection_wizard_final_filter_attributes;
	public static String dialog_connection_wizard_final_filter_link_tooltip;
	public static String dialog_connection_wizard_final_filter_link_not_supported_text;
	public static String dialog_connection_wizard_final_filter_link_not_supported_tooltip;
	public static String dialog_connection_wizard_final_button_tunneling;

	public static String dialog_connection_wizard_connection_init;
	public static String dialog_connection_wizard_connection_init_description;
	public static String dialog_connection_wizard_final_group_other;

	public static String dialog_connection_wizard_start_dialog_error_title;
	public static String dialog_connection_wizard_start_dialog_interrupted_message;
	public static String dialog_connection_wizard_start_dialog_interrupted_title;
	public static String dialog_connection_wizard_title;

	public static String dialog_migrate_wizard_choose_driver_description;
	public static String dialog_migrate_wizard_choose_driver_title;
	public static String dialog_migrate_wizard_name;
	public static String dialog_migrate_wizard_start_description;
	public static String dialog_migrate_wizard_start_title;
	public static String dialog_migrate_wizard_window_title;
	public static String dialog_new_connection_wizard_monitor_load_data_sources;
	public static String dialog_new_connection_wizard_start_description;
	public static String dialog_new_connection_wizard_start_title;
	public static String dialog_new_connection_wizard_title;

	public static String dialog_project_export_wizard_main_page;
	public static String dialog_project_export_wizard_monitor_collect_info;
	public static String dialog_project_export_wizard_monitor_export_driver_info;
	public static String dialog_project_export_wizard_monitor_export_libraries;
	public static String dialog_project_export_wizard_monitor_export_project;
	public static String dialog_project_export_wizard_page_checkbox_overwrite_files;
	public static String dialog_project_export_wizard_page_dialog_choose_export_dir_message;
	public static String dialog_project_export_wizard_page_dialog_choose_export_dir_text;
	public static String dialog_project_export_wizard_page_label_directory;
	public static String dialog_project_export_wizard_page_message_check_script;
	public static String dialog_project_export_wizard_page_message_configure_settings;
	public static String dialog_project_export_wizard_page_message_no_output_dir;
	public static String dialog_project_export_wizard_page_title;
	public static String dialog_project_export_wizard_start_archive_name_prefix;
	public static String dialog_project_export_wizard_start_checkbox_libraries;
	public static String dialog_project_export_wizard_start_dialog_directory_message;
	public static String dialog_project_export_wizard_start_dialog_directory_text;
	public static String dialog_project_export_wizard_start_label_directory;
	public static String dialog_project_export_wizard_start_label_output_file;
	public static String dialog_project_export_wizard_start_message_choose_project;
	public static String dialog_project_export_wizard_start_message_configure_settings;
	public static String dialog_project_export_wizard_start_message_empty_output_directory;
	public static String dialog_project_export_wizard_start_title;
	public static String dialog_project_export_wizard_window_title;

	public static String dialog_project_import_wizard_file_checkbox_import_libraries;
	public static String dialog_project_import_wizard_file_column_source_name;
	public static String dialog_project_import_wizard_file_column_target_name;
	public static String dialog_project_import_wizard_file_description;
	public static String dialog_project_import_wizard_file_dialog_export_archive_text;
	public static String dialog_project_import_wizard_file_group_input;
	public static String dialog_project_import_wizard_file_group_projects;
	public static String dialog_project_import_wizard_file_label_file;
	public static String dialog_project_import_wizard_file_message_cannt_find_projects;
	public static String dialog_project_import_wizard_file_message_choose_project;
    public static String dialog_project_import_wizard_file_message_project_exists;
	public static String dialog_project_import_wizard_file_message_ready;
	public static String dialog_project_import_wizard_file_name;
	public static String dialog_project_import_wizard_file_title;
    public static String dialog_project_import_wizard_message_success_import_message;
	public static String dialog_project_import_wizard_message_success_import_title;
	public static String dialog_project_import_wizard_monitor_import_drivers;
	public static String dialog_project_import_wizard_monitor_import_project;
	public static String dialog_project_import_wizard_monitor_import_projects;
	public static String dialog_project_import_wizard_monitor_load_driver;
	public static String dialog_project_import_wizard_monitor_load_libraries;
	public static String dialog_project_import_wizard_title;

	public static String dialog_scripts_export_wizard_page_name;
	public static String dialog_scripts_export_wizard_window_title;

	public static String dialog_scripts_import_wizard_description;
	public static String dialog_scripts_import_wizard_dialog_choose_dir_message;
	public static String dialog_scripts_import_wizard_dialog_choose_dir_text;
	public static String dialog_scripts_import_wizard_dialog_error_text;
	public static String dialog_scripts_import_wizard_dialog_error_title;
	public static String dialog_scripts_import_wizard_dialog_message_no_scripts;
	public static String dialog_scripts_import_wizard_dialog_message_success_imported;
	public static String dialog_scripts_import_wizard_dialog_message_title;
	public static String dialog_scripts_import_wizard_label_default_connection;
	public static String dialog_scripts_import_wizard_label_file_mask;
	public static String dialog_scripts_import_wizard_label_input_directory;
	public static String dialog_scripts_import_wizard_label_root_folder;
	public static String dialog_scripts_import_wizard_monitor_import_scripts;
	public static String dialog_scripts_import_wizard_name;
	public static String dialog_scripts_import_wizard_title;
	public static String dialog_scripts_import_wizard_window_title;

	public static String dialog_tunnel_checkbox_use_handler;
	public static String dialog_tunnel_title;

	public static String dialog_version_update_available_new_version;
	public static String dialog_version_update_button_more_info;
	public static String dialog_version_update_current_version;
	public static String dialog_version_update_n_a;
	public static String dialog_version_update_new_version;
	public static String dialog_version_update_no_new_version;
	public static String dialog_version_update_notes;
	public static String dialog_version_update_press_more_info_;
	public static String dialog_version_update_title;

	public static String model_html_read_database_meta_data;

	public static String model_navigator_Description;
	public static String model_navigator_Name;
	public static String model_navigator_load_;
	public static String model_navigator_load_items_;
	public static String model_navigator_Model_root;
	public static String model_navigator_Project;
	public static String model_navigator_resource_exception_already_exists;
	public static String model_navigator_Root;

	public static String model_project_bookmarks_folder;
	public static String model_project_cant_open_bookmark;
	public static String model_project_open_bookmark;
	public static String model_project_Script;
	public static String model_project_Scripts;

	public static String pref_page_confirmations_combo_always;
	public static String pref_page_confirmations_combo_never;
	public static String pref_page_confirmations_combo_prompt;
	public static String pref_page_confirmations_group_general_actions;
	public static String pref_page_confirmations_group_object_editor;
    public static String pref_page_confirmations_table_column_confirmation;
    public static String pref_page_confirmations_table_column_group;
    public static String pref_page_confirmations_table_column_value;

	public static String pref_page_database_general_separate_meta_connection;
	public static String pref_page_database_general_checkbox_case_sensitive_names;
	public static String pref_page_database_general_checkbox_rollback_on_error;
	public static String pref_page_database_general_checkbox_show_row_count;
	public static String pref_page_database_general_group_metadata;
	public static String pref_page_database_general_group_ordering;

	public static String pref_page_error_handle_name;
	public static String pref_page_error_handle_description;

	public static String pref_page_error_handle_group_timeouts_title;
	public static String pref_page_error_handle_connection_open_timeout_label;
	public static String pref_page_error_handle_connection_open_timeout_label_tip;
	public static String pref_page_error_handle_connection_close_timeout_label;
	public static String pref_page_error_handle_connection_close_timeout_label_tip;
	public static String pref_page_error_handle_connection_validate_timeout_label;
	public static String pref_page_error_handle_connection_validate_timeout_label_tip;

	public static String pref_page_error_handle_group_execute_title;
	public static String pref_page_error_handle_recover_enabled_label;
	public static String pref_page_error_handle_recover_enabled_tip;
	public static String pref_page_error_handle_recover_retry_count_label;
	public static String pref_page_error_handle_recover_retry_count_tip;

	public static String pref_page_error_handle_group_cancel_title;
	public static String pref_page_error_handle_cancel_check_timeout;
	public static String pref_page_error_handle_cancel_check_timeout_tip;

    public static String pref_page_query_manager_checkbox_ddl_executions;
	public static String pref_page_query_manager_checkbox_metadata_read;
    public static String pref_page_query_manager_checkbox_metadata_write;
	public static String pref_page_query_manager_checkbox_other;
	public static String pref_page_query_manager_checkbox_queries;
	public static String pref_page_query_manager_checkbox_scripts;
	public static String pref_page_query_manager_checkbox_sessions;
	public static String pref_page_query_manager_checkbox_transactions;
	public static String pref_page_query_manager_checkbox_user_queries;
	public static String pref_page_query_manager_checkbox_user_filtered;
	public static String pref_page_query_manager_checkbox_user_scripts;
	public static String pref_page_query_manager_checkbox_utility_functions;
	public static String pref_page_query_manager_group_object_types;
	public static String pref_page_query_manager_group_query_types;
    public static String pref_page_query_manager_group_settings;
	public static String pref_page_query_manager_group_storage;
    public static String pref_page_query_manager_checkbox_store_log_file;
    public static String pref_page_query_manager_logs_folder;
	public static String pref_page_query_manager_label_days_to_store_log;
	public static String pref_page_query_manager_label_entries_per_page;
	public static String pref_page_query_manager_log_file_hint;

	public static String pref_page_ui_general_checkbox_automatic_updates;
	public static String pref_page_ui_general_combo_language;
	public static String pref_page_ui_general_combo_language_tip;
	public static String pref_page_ui_general_keep_database_editors;
	public static String pref_page_ui_general_refresh_editor_on_open;
	public static String pref_page_ui_general_group_general;
	public static String pref_page_ui_general_group_language;
	public static String pref_page_ui_general_group_editors;

	public static String runtime_jobs_connect_name;
	public static String runtime_jobs_connect_status_connected;
	public static String runtime_jobs_connect_status_error;
	public static String runtime_jobs_connect_thread_name;
	public static String runtime_jobs_disconnect_error;
	public static String runtime_jobs_disconnect_name;

	public static String toolbar_editors_sql_run_statement_name;
	public static String toolbar_editors_sql_run_statementNew_name;
	public static String toolbar_editors_sql_run_script_name;
    public static String toolbar_editors_sql_run_scriptNew_name;
	public static String toolbar_editors_sql_run_explain_name;

	public static String editor_file_open_in_explorer;
	public static String editor_file_copy_path;
	public static String editor_file_rename;

	// New Connection Wizard
	public static String dialog_setting_connection_wizard_title;
	public static String dialog_setting_connection_general;

	public static String dialog_connection_network_title;
	public static String dialog_connection_wizard_final_label_connection_type;
	public static String dialog_connection_wizard_final_label_connection_types_edit;
	public static String dialog_connection_wizard_final_label_edit;
	public static String dialog_connection_wizard_final_label_connection_folder;
	public static String dialog_connection_wizard_final_label_connection;
	public static String dialog_connection_wizard_final_label_isolation_level;
	public static String dialog_connection_wizard_final_label_default_database;
	public static String dialog_connection_wizard_final_label_default_database_tooltip;
	public static String dialog_connection_wizard_final_label_default_schema;
	public static String dialog_connection_wizard_final_label_default_schema_tooltip;
	public static String dialog_connection_wizard_final_label_keepalive;
	public static String dialog_connection_wizard_final_label_isolation_level_tooltip;
	public static String dialog_connection_wizard_final_label_keepalive_tooltip;
	public static String dialog_connection_wizard_final_label_bootstrap_query;
	public static String dialog_connection_wizard_configure;
	public static String dialog_connection_wizard_final_label_shell_command;
	public static String dialog_connection_wizard_connection_init_hint;
	public static String dialog_connection_wizard_connection_init_hint_tip;
	public static String dialog_connection_wizard_description;
	public static String dialog_connection_wizard_final_label_bootstrap_tooltip;
	public static String dialog_connection_wizard_socksproxy_host;
	public static String dialog_connection_wizard_socksproxy_port;
	public static String dialog_connection_wizard_socksproxy_username;
	public static String dialog_connection_wizard_socksproxy_password;
	public static String dialog_connection_driver_project;


	// Connections
	public static String pref_page_database_client_name_group;
	public static String pref_page_database_client_name_group_description;
	public static String pref_page_database_label_disable_client_application_name;
	public static String pref_page_database_label_override_client_application_name;
	public static String pref_page_database_label_client_application_name;

	// MetaData
	public static String pref_page_database_general_separate_meta_connection_tip;
	public static String pref_page_database_general_checkbox_case_sensitive_names_tip;
	public static String pref_page_database_general_checkbox_show_row_count_tip;
	public static String pref_page_database_general_server_side_object_filters;
	public static String pref_page_database_general_server_side_object_filters_tip;
	public static String pref_page_database_general_group_query_metadata;
	public static String pref_page_database_general_use_column_names;
	public static String pref_page_database_general_use_column_names_tip;
	// EntityEditor
	public static String pref_page_ui_general_keep_database_editors_tip;
	public static String pref_page_ui_general_refresh_editor_on_open_tip;
	public static String pref_page_ui_general_show_full_name_in_editor;
	public static String pref_page_ui_general_show_table_grid;
	public static String pref_page_ui_general_show_preview_on_save;
	// DatabaseGeneral
	public static String pref_page_ui_general_group_task_bar;
	public static String pref_page_ui_general_label_enable_long_operations;
	public static String pref_page_ui_general_label_enable_long_operations_tip;
	public static String pref_page_ui_general_label_long_operation_timeout;
	public static String pref_page_ui_general_group_notifications;
	public static String pref_page_ui_general_label_enable_notifications;
	public static String pref_page_ui_general_label_enable_notifications_tip;
	public static String pref_page_ui_general_label_notifications_close_delay;
	public static String pref_page_ui_general_group_resources;
	public static String pref_page_ui_general_label_default_resource_encoding;
	public static String pref_page_ui_general_label_set_default_resource_encoding_tip;
	public static String pref_page_ui_general_group_debug_logs;
	public static String pref_page_ui_general_label_enable_debug_logs;
	public static String pref_page_ui_general_label_enable_debug_logs_tip;
	public static String pref_page_ui_general_label_log_file_location;
	public static String pref_page_ui_general_label_open_file_text;
	public static String pref_page_ui_general_label_options_take_effect_after_restart;
	public static String pref_page_ui_general_label_settings;

	public static String pref_page_database_general_label_sync_editor_connection_with_navigator;
	public static String pref_page_database_general_label_sync_editor_connection_with_navigator_tip;

	public static String pref_page_database_general_group_toolbars;
	public static String pref_page_database_general_label_show_general_toolbar_everywhere;
	public static String pref_page_database_general_label_show_general_toolbar_everywhere_tip;
	public static String pref_page_database_general_label_show_edit_toolbar;
	public static String pref_page_database_general_label_show_edit_toolbar_tip;
	public static String pref_page_database_general_label_database_selector_width;
	public static String pref_page_database_general_label_database_selector_width_tip;
	public static String pref_page_database_general_label_schema_selector_width;
	public static String pref_page_database_general_label_schema_selector_width_tip;

	// ConnectionTypes
	public static String pref_page_connection_types_label_table_column_name;
	public static String pref_page_connection_types_label_table_column_description;
	public static String pref_page_connection_types_label_delete_connection_type;
	public static String pref_page_connection_types_label_delete_connection_type_description;
	public static String pref_page_connection_types_group_settings;
	public static String pref_page_connection_types_label_name;
	public static String pref_page_connection_types_label_description;
	public static String pref_page_connection_types_label_color;
	public static String pref_page_connection_types_label_auto_commit_by_default;
	public static String pref_page_connection_types_label_confirm_sql_execution;
	public static String pref_page_connection_types_label_confirm_data_change;
	public static String pref_page_connection_types_label_confirm_data_change_tip;

	public static String pref_page_connection_label_general;

	public static String pref_page_connection_label_use_environment;
    public static String pref_page_connections_application_name_text;

	public static String transaction_info_dialog_checkbox_show_all_queries;

	public static String transaction_info_dialog_checkbox_show_previous_transactions;

	public static String transaction_info_dialog_label_otherwise;

	public static String transaction_info_dialog_label_show_all_transaction_queries;

	public static String transaction_log_dialog_header_transaction_log;

	// Preference/Properties

	public static String transaction_log_dialog_error_connect_to_a_database;

	public static String transaction_log_dialog_error_no_editor;

	public static String transaction_log_dialog_error_open_database;

	// Connection edit
	public static String dialog_connection_edit_title;

	public static String dialog_connection_edit_wizard_general;
	public static String dialog_connection_edit_wizard_general_bootstrap_query_title;
	public static String dialog_connection_edit_wizard_general_bootstrap_query_sql_label;
	public static String dialog_connection_edit_wizard_general_bootstrap_query_sql_title;
	public static String dialog_connection_edit_wizard_general_bootstrap_query_ignore_error_lable;

	public static String dialog_connection_edit_wizard_shell_cmd;
	public static String dialog_connection_edit_wizard_shell_cmd_pause_label;
	public static String dialog_connection_edit_wizard_shell_cmd_pause_tooltip;
	public static String dialog_connection_edit_wizard_shell_cmd_directory_label;
	public static String dialog_connection_edit_wizard_shell_cmd_directory_title;
	public static String dialog_connection_edit_wizard_shell_cmd_variables_hint_label;
	public static String dialog_connection_edit_wizard_shell_cmd_variables_hint_title;

	public static String dialog_connection_edit_wizard_connections;
	public static String dialog_connection_edit_wizard_connections_description;
	public static String dialog_connection_edit_wizard_transactions;
	public static String dialog_connection_edit_wizard_transactions_description;
	public static String dialog_connection_edit_wizard_metadata;
	public static String dialog_connection_edit_wizard_metadata_description;
	public static String dialog_connection_edit_wizard_resultset;
	public static String dialog_connection_edit_wizard_resultset_description;
	public static String dialog_connection_edit_wizard_editors;
	public static String dialog_connection_edit_wizard_editors_description;
	public static String dialog_connection_edit_wizard_data_format;
	public static String dialog_connection_edit_wizard_data_format_description;
	public static String dialog_connection_edit_wizard_presentation;
	public static String dialog_connection_edit_wizard_presentation_description;
	public static String dialog_connection_edit_wizard_sql_editor;
	public static String dialog_connection_edit_wizard_sql_editor_description;
	public static String dialog_connection_edit_wizard_sql_processing;
	public static String dialog_connection_edit_wizard_sql_processing_description;

	public static String dialog_connection_edit_wizard_conn_change_title;
	public static String dialog_connection_edit_wizard_conn_change_question;
	public static String dialog_connection_edit_wizard_lock_pwd_title;
	public static String dialog_connection_edit_wizard_bad_pwd_title;
	public static String dialog_connection_edit_wizard_bad_pwd_msg;
	public static String dialog_connection_edit_wizard_error_md5_title;
	public static String dialog_connection_edit_wizard_error_md5_msg;
	//Connection edit

	// Driver edit

	// Driver download

	public static String transaction_log_dialog_error_not_connected;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, CoreMessages.class);
	}

	private CoreMessages() {
	}
}
