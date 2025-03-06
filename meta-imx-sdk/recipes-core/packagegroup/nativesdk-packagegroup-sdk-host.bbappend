RDEPENDS:${PN} += " \
    nativesdk-glslang \
    ${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'nativesdk-python3-pyelftools', '', d)} \
"
