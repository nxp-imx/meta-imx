SUMMARY = "unittest-based test runner with Ant/JUnit like XML reporting."
HOMEPAGE = "http://github.com/xmlrunner/unittest-xml-reporting/tree/master/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

PYPI_PACKAGE = "unittest-xml-reporting"

SRC_URI[md5sum] = "d338a2e4a3ddcc407d0e07715cae9cba"
SRC_URI[sha256sum] = "140982e4b58e4052d9ecb775525b246a96bfc1fc26097806e05ea06e9166dd6c"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-six ${PYTHON_PN}-core ${PYTHON_PN}-datetime \
    ${PYTHON_PN}-io ${PYTHON_PN}-unittest ${PYTHON_PN}-xml \
"
