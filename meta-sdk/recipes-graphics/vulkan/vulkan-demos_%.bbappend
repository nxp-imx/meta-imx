
DEPENDS_remove = "vulkan"
DEPENDS_append = " vulkan-headers vulkan-loader"

SRC_URI_append = " http://vulkan.gpuinfo.org/downloads/vulkan_asset_pack.zip"
SRC_URI[md5sum] = "9cbed11464726c23d8ecc83671f5b320"
SRC_URI[sha256sum] = "05874d975a22bde61ed87f45963ba3048d2babe90e731d921b3ab952f25df8ae"

# Install newer assests
do_install_append () {
    cp -r ${WORKDIR}/data/* ${D}${datadir}/vulkan-demos
}
