# Ugly hack to work around undefined OE_QMAKE_PATH_EXTERNAL_HOST_BINS variable
# and possibly missing qmake binary (qtbase-native can be removed from sysroot
# e.g. in order to upgrade it, even when there is target qtbase)

#do_configure_prepend() {
#    sed -i 's/^find_package(Qt5Core QUIET)$/#find_package(Qt5Core QUIET)/g' ${S}/Tests/RunCMake/CMakeLists.txt
#}

do_configure_prepend() {
    sed -i 's/^find_package(Qt5Core QUIET)$/#find_package(Qt5Core QUIET)/g' ${S}/Tests/RunCMake/CMakeLists.txt
    sed -i 's/^find_package(Qt5Core REQUIRED)/#find_package(Qt5Core REQUIRED)/g' ${S}/Tests/RunCMake/IncompatibleQt/IncompatibleQt.cmake
    sed -i 's/^  find_package(Qt5Widgets REQUIRED)/#  find_package(Qt5Widgets REQUIRED)/g' ${S}/Tests/QtAutomoc/CMakeLists.txt
    sed -i 's/^  find_package(Qt5Widgets QUIET NO_MODULE)/#  find_package(Qt5Widgets QUIET NO_MODULE)/g' ${S}/Tests/CMakeLists.txt
    sed -i 's/^find_package(Qt5Widgets QUIET)/#find_package(Qt5Widgets QUIET)/g' ${S}/Source/QtDialog/CMakeLists.txt
}
