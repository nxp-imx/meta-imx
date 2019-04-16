require python-unittest-xml-reporting.inc
inherit pypi setuptools

RDEPENDS_${PN} += "${PYTHON_PN}-lang ${PYTHON_PN}-argparse"
