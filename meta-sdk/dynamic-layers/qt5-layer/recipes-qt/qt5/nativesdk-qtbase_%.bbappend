# Move the implementation to do_install
# fix environment-setup.d conflict between nativesdk-qtbase and nativesdk-cmake
do_generate_qt_environment_file[noexec] = "1"
do_install:append () {
    do_generate_qt_environment_file
}
