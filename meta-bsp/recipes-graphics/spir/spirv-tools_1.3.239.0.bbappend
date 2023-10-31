do_install:append:class-target() {
    # Properly set _IMPORT_PREFIX in INTERFACE_LINK_LIBRARIES so that dependent
    # tools can find the right library
    sed -i ${D}${libdir}/cmake/SPIRV-Tools/SPIRV-ToolsTarget.cmake \
        -e 's:INTERFACE_LINK_LIBRARIES.*$:INTERFACE_LINK_LIBRARIES "\$\{_IMPORT_PREFIX\}/${baselib}":'
}
