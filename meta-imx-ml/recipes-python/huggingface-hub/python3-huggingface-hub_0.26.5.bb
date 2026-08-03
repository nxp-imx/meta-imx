SUMMARY = "Client library to download and publish models on the Hugging Face Hub"
DESCRIPTION = "Hugging Face Hub Python client — used by ara2 fetch_models.py to \
download prebuilt model snapshots from the Hugging Face Hub."
HOMEPAGE = "https://github.com/huggingface/huggingface_hub"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI[sha256sum] = "1008bd18f60bfb65e8dbc0a97249beeeaa8c99d3c2fa649354df9fa5a13ed83b"

inherit pypi setuptools3

PYPI_PACKAGE = "huggingface_hub"

RDEPENDS:${PN} += " \
    python3-core \
    python3-filelock \
    python3-fsspec \
    python3-packaging \
    python3-pyyaml \
    python3-requests \
    python3-tqdm \
    python3-typing-extensions \
    python3-netclient \
"

BBCLASSEXTEND = "native nativesdk"
