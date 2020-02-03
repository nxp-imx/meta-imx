require python-pycryptodome.inc
inherit setuptools3

# This recipe install pycryptodome as an independent library.
do_configure_prepend () {
touch ${S}/.separate_namespace
}
