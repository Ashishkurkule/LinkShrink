import React from "react";
import { FaFacebook, FaTwitter, FaInstagram, FaLinkedin, FaCode, FaGithub } from "react-icons/fa";

const Footer = () => {
  return (
    <footer className="bg-custom-gradient text-white py-8 z-40 relative">
      <div className="container mx-auto px-6 lg:px-14 flex flex-col lg:flex-row lg:justify-between items-center gap-4">
        <div className="text-center lg:text-left">
          <h2 className="text-3xl font-bold mb-2">LinkShrink</h2>
          <p>Simplifying URL shortening for efficient sharing</p>
        </div>

        <p className="mt-4 lg:mt-0">
          &copy; 2026 LinkShrink. All rights reserved.
        </p>

        <div className="flex space-x-6 mt-4 lg:mt-0">
          <a href="https://leetcode.com/u/Ashish_Kurkule/" className="hover:text-gray-200">
            <FaCode size={24} />
          </a>
          <a href="https://github.com/Ashishkurkule" className="hover:text-gray-200">
            <FaGithub size={24} />
          </a>
          <a href="https://www.instagram.com/mr_ashish_kurkule10/" className="hover:text-gray-200">
            <FaInstagram size={24} />
          </a>
          <a href="https://www.linkedin.com/in/ashish-kurkule/" className="hover:text-gray-200">
            <FaLinkedin size={24} />
          </a>
        </div>
      </div>
    </footer>
  );
};

export default Footer;